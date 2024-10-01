package org.example.array;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LonelyInteger {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = findLonelyInteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
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
