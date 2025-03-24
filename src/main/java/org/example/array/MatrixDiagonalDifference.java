package org.example.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, count and return the number of times each value appears as an array of integers.
 */
public class MatrixDiagonalDifference {

    public static void main(String[] args) {
        int[] ints = new int[100];
        List<Integer> result = Arrays.stream((new int[100])).boxed().collect(Collectors.toList());

        System.out.println(result);
    }


}
