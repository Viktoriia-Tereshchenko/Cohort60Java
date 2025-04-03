package homework_48;

/*
Task 3
Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> integers = List.of(5, 4, 12, 13, 6, 24, -10, -5, 0, 42, -21);

        List<Integer> intEven = integers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println("intEven: " + intEven);
    }
}
