package homework_42.myComparator;

/*
Task 2 * ОПЦИОНАЛЬНО
Напишите MyComparator, реализующий Comparator с методом сравнения
для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами


Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
 */

import java.util.Arrays;

public class MyComparatorApp {
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, new MyComparator());
        System.out.println(Arrays.toString(integers));


        Integer[] integers2 = {-9, 8, 0, -5, 7, 6, 2, -4};
        Arrays.sort(integers2, new MyComparator());
        System.out.println(Arrays.toString(integers2));
    }
}
