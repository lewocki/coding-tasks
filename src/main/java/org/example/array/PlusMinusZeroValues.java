package org.example.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with  places after the decimal.
 */
public class PlusMinusZeroValues {

    public static void main(String[] args) {

        List<Integer> arr = List.of(1, 1, 0, -1, -1, 4, 0, -6, -12, -5);

        plusMinusFunction(arr);
    }
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinusFunction(List<Integer> arr) {
        // Write your code here
        double size = arr.size();
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                positive++;
            }
            if (integer < 0) {
                negative++;
            }
            if (0 == integer) {
                zero++;
            }
        }

        BigDecimal value = new BigDecimal(positive / size).setScale(6, RoundingMode.HALF_UP);
        System.out.println("positive values: ".concat(String.format("%." + 6 + "f", value)));

        value = new BigDecimal(negative / size).setScale(6, RoundingMode.HALF_UP);
        System.out.println("negative values: ".concat(String.format("%." + 6 + "f", value)));

        value = new BigDecimal(zero / size).setScale(6, RoundingMode.HALF_UP);
        System.out.println("zero values: ".concat(String.format("%." + 6 + "f", value)));
    }
}
