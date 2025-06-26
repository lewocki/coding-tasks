package coding.task;

import java.util.*;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UbsCodingTask {

    public static void main(String[] args) {

        // Print duplicated numbers from a list, e.g. int number[] = {1, 2, 3, 3, 4, 5, 5, 6};
        int[] number = {1, 2, 3, 3, 4, 5, 5, 6};

        Map<Integer, Long> collected = Arrays.stream(number).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collected.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key);
            }
        });

        //Given String str = "123456789", calculate the sum of all digits in the string.
        String str = "assd123ad4567a8a9..87897**#@$";
        String[] replaceAll = str.replaceAll("\\D", "").split("");
        Integer summ1 = Arrays.stream(replaceAll).map(Integer::valueOf).reduce(0, Integer::sum);
        long summ2 = Arrays.stream(replaceAll)
                .map(Integer::valueOf)
                .collect(Collectors.summarizingInt(Integer::intValue))
                .getSum();
        System.out.println(summ2);
        System.out.println(summ1);

        //Given String str = "We are on the interview meeting", print how many times each letter occurs.
        String input = "We are 2 on the int1erview 2meeting";
        Map<String, Long> collect = Arrays.stream(input.toLowerCase().split(""))
                .filter(s -> !s.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(input.toLowerCase());
        Map<String, Long> collect1 = matcher.results()
                .map(MatchResult::group)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);
    }
}
