package coding.task;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EpamCodingTask {

    public static void main(String[] args) {
        String[] words = {"thing", "ate", "tea", "night", "stop", "post", "tops", "eat", "rose"};
        List<String> wordsList = Arrays.asList(words);

        Map<String, List<String>> result = new HashMap<>();
        List<String> arrayList = new ArrayList<>();
        arrayList.add(wordsList.getFirst());
        Function<String, String> sortChars = it -> Arrays.stream(it.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        result.put(sortChars.apply(wordsList.getFirst()), arrayList);

        for (int i = 1; i < wordsList.size(); i++) {
            String value = wordsList.get(i);
            String key = sortChars.apply(value);
            if (result.containsKey(key)) {
                List<String> values = result.get(key);
                values.add(value);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(value);
                result.put(key, newList);
            }
            Stream.of(result).forEach(System.out::println);
        }
        Stream.of(result).forEach(System.out::println);
    }
}
