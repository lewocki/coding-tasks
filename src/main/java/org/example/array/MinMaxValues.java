package org.example.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinMaxValues {


    public static void main(String[] args) {
        List<Integer> input = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
        miniMaxSum(input);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        Integer min = arr.getFirst();
        Integer max = arr.getLast();
        long sum = arr.stream().mapToLong(Integer::longValue).sum();
        long minValue = sum - max;
        long maxValue = sum - min;
        System.out.print(minValue + " | " + maxValue);
    }
}
