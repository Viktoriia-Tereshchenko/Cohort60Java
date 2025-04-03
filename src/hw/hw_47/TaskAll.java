package hw.hw_47;
/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
четные, больше 10 и меньше 100
Для фильтрации используйте Stream API

Task 2
Дан список строк.
Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A")
и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.

Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"
 */

import homework_47.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TaskAll {

    public static void main(String[] args) {
        String test = "Hello";
        System.out.println(test.substring(0, 1));

        // проверяет, заканчивается ли строка на другую строку (последовательность символов)
        test.endsWith("llo");

        System.out.println(test.endsWith("llo")); // true
        System.out.println(test.endsWith("ll")); // false

        // проверяет, начинается ли строка на другую строку (последовательность символов)
        test.startsWith("H");

        System.out.println(test.startsWith("H")); // true
        System.out.println(test.startsWith("D")); // false

        // проверяет, содержит ли строка на другую строку (последовательность символов)
        test.contains("ello");

        System.out.println(test.contains("ello"));
        System.out.println("========================================");

        List<String> strings = List.of("test", "Abba", "Arrow", "Java", "a", "annotation");
        System.out.println(filterStrings(strings));

        System.out.println();
        List<Person> people = new ArrayList<>(List.of(
                new Person("Person", 21, "Munich"),
                new Person("Person2", 28, "Berlin"),
                new Person("Person3", 27, "Munich"),
                new Person("Person4", 25, "Berlin"),
                new Person("Person5", 19, "Berlin"),
                new Person("Person6", 45, null)
        ));
        people.add(null);

        System.out.println(filterPersons(people, 25, "Berlin"));

    }

    public static List<Integer> filterIntegers(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i > 10 && i < 100)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }


    public static List<String> filterStrings(List<String> strings) {
        //String findMe = "A";
        return strings.stream()
                //.filter(s-> s.charAt(0) == 'A')
                //.filter(s -> s.substring(0, 1).equalsIgnoreCase("A"))
                //.filter(s -> s.toUpperCase().startsWith("A"))
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Person> filterPersons(List<Person> people, int age, String city) {

        return people.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > age)
                .filter(p -> Objects.nonNull(p.getCity()))
                .filter(p -> p.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }
}
