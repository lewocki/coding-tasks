package com.sdg;

import com.github.javafaker.Faker;
import org.instancio.Instancio;

import java.util.List;
import java.util.stream.IntStream;

import static org.instancio.Select.field;

public class TestDataGenerator {

        public static User generateRandomUser() {
        return Instancio.of(User.class)
                .set(field(User::getName), Faker.instance().name().firstName().toString())
                .generate(field(User::getAge), gen -> gen.ints().range(29, 70))
                .create();
    }

    public static List<User> generateRandomUsers(int amount) {
        return IntStream.range(0, amount)
                .mapToObj(i -> generateRandomUser())
                .toList();
    }

}
