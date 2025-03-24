package com.sdg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sdg.TestDataGenerator.generateRandomUsers;

public class TechInterviewTask {

    // find users with age from [20 to 79]
    // split by 10 years
    // calculate users in each decade

    public static void main(String[] args) {
        List<User> users = generateRandomUsers(10);
        System.out.println("USERS:");
        users.forEach(System.out::println);

        List<User> usersBetween20and79 = users.stream()
                .filter(it -> it.getAge() >= 20)
                .filter(it -> it.getAge() <= 79)
                .toList();

        Map<String, Integer> result = new HashMap<>();
        for (int i = 2; i < 8; i++) {
            String ageDecade = String.valueOf(i);
            List<User> temp = usersBetween20and79.stream()
                    .filter(it -> String.valueOf(it.getAge()).startsWith(ageDecade))
                    .toList();
            result.put(ageDecade, temp.size());
        }

        System.out.println("RESULT:");
        result.forEach((k, v) -> System.out.printf("Decade [%s0 - %s0]: %s users%n", k, Integer.parseInt(k) + 1, v));
    }
}
