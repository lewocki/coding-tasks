package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleUiTest {

    private WebDriver driver;

    @BeforeEach
    public void initDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testPageTitle() {
        driver.get("https://github.com/");

        String title = driver.getTitle();

        assertThat(title).contains("GitHub");
    }

    @Test
    public void testSearch() {
        driver.get("https://github.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(@aria-label, 'Search or jump')]"));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton))
                .click();

        driver.findElement(By.id("query-builder-test")).sendKeys("JDG" + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='search-sub-header']")));

        List<String> searchResults = driver.findElements(By.xpath("//div[@data-testid='results-list']/div"))
                .stream()
                .map(WebElement::getText)
                .toList();
        boolean anyMatch = searchResults.stream()
                .anyMatch(it -> it.contains("Гайд-путеводитель по JDG (ИП) в Польше"));
        assertThat(anyMatch).isTrue();
    }
}
