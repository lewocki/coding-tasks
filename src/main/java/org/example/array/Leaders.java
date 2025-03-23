package org.example.array;

import java.util.ArrayList;
import java.util.List;


//=============================
//    LIVE  CODING ACTIVITY
//=============================
//
//    Instruction:
//
//    Write a program to collect all the org.example.array.Leaders in the array. An element is a Leader if it is greater than all the elements to its right side.
//    Note: The rightmost element is always a leader.
//
//-------
//    Example 1:
//    Input: inputArr[] = { 16, 17, 4, 3, 5, 2 }
//    Output: outputArr[] = { 17, 5, 2 }
//
//    Example 2:
//    Input: inputArr[] = { 1, 2, 3, 4, 5, 2 }
//    Output: outputArr[] = { 5, 2 }
//
//-------
public class Leaders {

    public static List<Integer> collectLeaders(int[] inputArray) {
        List<Integer> result = new ArrayList<>();
        result.add(inputArray[inputArray.length - 1]);
        for (int i = inputArray.length - 2; i > 0; i--) {
            int temp = inputArray[i];
            if (temp > result.getLast()) {
                result.add(temp);
            }
        }
        return result.reversed();
    }

    public static void main(String[] args) {
        int[] inputArr = {16, 17, 11, 3, 15, 2};
        System.out.println("expected: " + "[17, 5, 2]");
        System.out.println("  actual: " + collectLeaders(inputArr).toString());

        System.out.println("=========");

        int[] inputArr2 = { 1, 2, 3, 4, 5, 2 };
        System.out.println("expected: " + "[5, 2]");
        System.out.println("  actual: " + collectLeaders(inputArr2).toString());
    }

}
