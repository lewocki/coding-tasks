package org.example.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LonelyInteger {

    public static void main(String[] args) {
        int result = findLonelyInteger(new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 4, 7, 7)));
        int result_2 = findLonelyInteger_v2(new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 4, 7, 7)));
        System.out.println(result == 3);
        System.out.println(result_2 == 3);
    }

    public static int findLonelyInteger(List<Integer> elements) {
        // Write your code here
        if (elements.isEmpty()) {
            System.out.println("No unique elements in the collection");
        }
        if (elements.size() == 1) {
            return elements.getFirst();
        }
        Set<Integer> integerSet = new HashSet<>();
        List<Integer> dublicatesElements = elements.stream()
                .filter(n -> !integerSet.add(n))
                .toList();
        elements.removeAll(dublicatesElements);


        if (elements.size() > 1) {
            System.out.println("More than 1 unique element in the collection: " + elements);
        }

        return elements.getFirst();
    }

    public static int findLonelyInteger_v2(List<Integer> elements) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();

        elements.forEach(it -> {
            Integer value = map.containsKey(it) ? map.get(it) + 1 : 1;
            map.put(it, value);
        });

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(0);
    }
}
