package homework_48;
/*

Task 1
Из списка целых чисел выделите те значения,
которые больше 10; отсортируйте эти значения по
значению последней цифры в числе и выведите результат на экране
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> integers = List.of(-7, 800, 22, 3, 47, 53, 14, 11, -19, 98, 26);

        List<Integer> intSort = integers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparing(i -> i % 10))
                .collect(Collectors.toList());

        System.out.println("intSort: " + intSort);

        // вариант 2 (без нового списка)
        integers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparing(i -> i % 10))
                .forEach(System.out::println);
    }
}
