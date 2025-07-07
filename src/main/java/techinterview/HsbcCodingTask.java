package techinterview;

import java.util.*;

public class HsbcCodingTask {

    /*
    Given an integer array and a target value, return the indices of two numbers that sum up to the target.
    input:[2,7,11,15], target:9, output:[0,1]
     */
    public static void main(String[] args) {
        int[] input = {4, 2, 17, 1, 13, 22, 11, 15};
        System.out.println(solution(input, 15));
        System.out.println(Arrays.toString(solution2(input, 15)));
    }

    private static Map<Integer, Integer> solution(int[] input, int target) {
        Map<Integer, Integer> result = new HashMap<>();
        List<Integer> list = Arrays.stream(input).boxed().toList();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (target == list.get(i) + list.get(j)) {
                    result.put(i, j);
                    break;
                }
            }
        }
        return result;
    }

    private static int[] solution2(int[] input, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int value = input[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            }
            int complement = target - value;
            map.put(complement, i);
        }
        return new int[]{};
    }

}
