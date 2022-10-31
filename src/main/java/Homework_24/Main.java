package Homework_24;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<Object, List<User>> users = Stream.generate(User::new)
                .limit(20)
                .filter(user -> user.age > 18)
                .sorted()
                .filter(user -> !(user.email == null))
                .collect(Collectors.groupingBy(User::getGender));

        System.out.println(users.toString());
    }
}
