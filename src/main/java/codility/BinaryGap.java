package codility;

import java.util.Arrays;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println("GAP IS = " + solution(1041));
        System.out.println("GAP IS = " + solution(15));
        System.out.println("GAP IS = " + solution(32));
        System.out.println("GAP IS = " + solution(51712));
        System.out.println("GAP IS = " + solution(4));

    }

    public static int solution(int inputNumber) {
        // Implement your solution here
        String binaryString = Integer.toBinaryString(inputNumber);
        System.out.println(binaryString);
        binaryString = binaryString.replaceAll("0+$", ""); // trim trailing zeros
        String[] gaps = binaryString.split("1");
        return Arrays.stream(gaps).mapToInt(String::length).max().orElse(0);
    }
}
