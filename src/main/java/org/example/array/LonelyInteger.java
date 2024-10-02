package org.example.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.addAll(List.of(1, 1, 2, 2, 3, 4, 4, 7, 7));

        int result = findLonelyInteger(input);
        System.out.println(result == 3);
    }

    public static int findLonelyInteger(List<Integer> elements) {
        // Write your code here
        if(elements.size() == 1) {
            return elements.getFirst();
        }
        Set<Integer> integerSet = new HashSet<>();
        List<Integer> dublicatesElements = elements.stream()
                .filter(n -> !integerSet.add(n))
                .toList();
        elements.removeAll(dublicatesElements);

        if (elements.isEmpty()) {
            System.out.println("No unique elements in the collection");
        }

        if (elements.size() > 1) {
            System.out.println("More than 1 unique element in the collection: " + elements);
        }

        return elements.getFirst();
    }
}
