package homework_48;

/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("Java", "Comparator", "Iterator", "Python", "JS", "Collection"));
        strings.add(null);

        // вариант1
        Optional<String> minStr1 = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));

        System.out.println("minStr1: " + minStr1.orElse(null));


        // вариант2
        Optional<String> minStr2 = strings.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(String::length))
                .findFirst();

        System.out.println("minStr2: " + minStr2.orElse(null));
    }
}
