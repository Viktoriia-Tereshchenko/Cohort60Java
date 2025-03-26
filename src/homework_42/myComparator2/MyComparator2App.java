package homework_42.myComparator2;

/*
Task 3 * ОПЦИОНАЛЬНО
Напишите MyComparator2 с методом сравнения для сортировки массива
целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания

Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
 */

import java.util.Arrays;

public class MyComparator2App {
    public static void main(String[] args) {

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Arrays.sort(integers, new MyComparator2());
        System.out.println(Arrays.toString(integers));

        Integer[] integers2 = {-9, -1, 3, 8, 0, -5, 7, 6, 2, -4};
        Arrays.sort(integers2, new MyComparator2());
        System.out.println(Arrays.toString(integers2));
    }
}
