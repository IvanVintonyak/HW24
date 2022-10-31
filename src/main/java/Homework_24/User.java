package Homework_24;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class User implements Comparable<User> {

    private static final List<Enum> VALUES =
            Collections.unmodifiableList(Arrays.asList(Enum.values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    final int age;
    final String email;
    private final String name;
    private final String gender;

    public User() {
        Faker faker = new Faker();
        this.name = faker.name().firstName();
        this.age = faker.random().nextInt(1, 50);
        this.email = faker.internet().emailAddress();
        this.gender = String.valueOf(randomGender());

    }

    public static Enum randomGender() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public int compareTo(User u) {
        return 0;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
