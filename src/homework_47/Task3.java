package homework_47;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Task 3
Дан список Person с полями name, age, city.
Используйте Stream API для фильтрации людей, которые старше определенного возраста
и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */
public class Task3 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 48, "Berlin"),
                new Person("Vlad", 35, "Oslo"),
                new Person("Max", 20, "Munich"),
                new Person("Hanna", 29, "Berlin"),
                new Person("Tom", 50, "Warsaw"),
                new Person("Kira", 31, "Munich"),
                new Person("Sem", 23, "Berlin"),
                new Person(null, 70, null)
        );

        System.out.println(peopleFiltering(people, 25, "Berlin"));
        System.out.println(peopleFiltering(people, 30, "Munich"));
    }


    public static List<Person> peopleFiltering(List<Person> people, int age, String city) {

        List<Person> result = people.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > age)
                .filter(p -> Objects.equals(p.getCity(),city))
                .collect(Collectors.toList());

        return result;
    }
}
