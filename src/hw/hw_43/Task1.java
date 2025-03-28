package hw.hw_43;

/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 3));
        List<Integer> integers2 = new ArrayList<>(List.of(3, 4, 4, 5, 6, 7, 8));

        List<Integer> result = intersection(integers, integers2);
        List<Integer> result2 = intersection(integers2, integers);
        System.out.println(result);
        System.out.println(result2);

        System.out.println("начальный список: " + integers);
    }

    public static <T> List<T> intersection(List<T> integers, List<T> integers2) {

        List<T> result = new ArrayList<>(integers);
        result.retainAll(integers2);
        return result;
    }
}
