package homework_47;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый,
отфильтрованный список.
В новом списке должны быть только те числа из старого списка,
которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */
public class Task1 {
    public static void main(String[] args) {

        List<Integer> integers = List.of(-1, 0, 200, -8, 18, 33, 5, 47, 64, 120, 22);
        System.out.println(numbersFiltering(integers));
    }

    public static List<Integer> numbersFiltering(List<Integer> integers) {

        List<Integer> result = integers.stream()
                //.filter(i -> i % 2 == 0 && i > 10 && i < 100)
                .filter(i -> i % 2 == 0)
                .filter(i -> i > 10)
                .filter(i -> i < 100)
                .collect(Collectors.toList());

        return result;
    }
}


