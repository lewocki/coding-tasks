plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.instancio:instancio-junit:5.3.0")
    implementation("com.github.javafaker:javafaker:1.0.2")
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
    implementation("io.rest-assured:rest-assured:5.5.5")
    implementation("org.seleniumhq.selenium:selenium-java:4.33.0")
    testImplementation("org.assertj:assertj-core:3.27.3")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Test> {
    systemProperty("file.encoding", "UTF-8")
}

tasks.test {
    useJUnitPlatform()
}