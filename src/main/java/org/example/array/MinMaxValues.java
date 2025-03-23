package org.example.array;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxValues {


    public static void main(String[] args) {
        List<Integer> input = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
        miniMaxSum(input);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Integer max = arr.stream().max(Comparator.naturalOrder()).orElse(0);
        Integer min = arr.stream().min(Comparator.naturalOrder()).orElse(0);
        long sum = arr.stream().mapToLong(Integer::longValue).sum();
        long minValue = sum - max;
        long maxValue = sum - min;
        System.out.print(minValue + " | " + maxValue);
    }
}
