package homework_17;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {

/*
Task 4 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти,
и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.

Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
        Random random = new Random();

        int[] array = new int[50];
        int count = 0;

        for (int i = 0; i < 50; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Исходный массив");
        printArray(array);

        System.out.print("Простые числа в массиве: ");

        for (int i = 0; i < array.length; i++) {

            // Простые числа до 10: 2, 3, 5, 7
            // Простые числа после 10: все, которые делятся с остатком на 2,3,4,5,6,7,8,9
            if (array[i] == 2 | array[i] == 3 | array[i] == 5 | array[i] == 7 |
                (array[i] % 2 != 0 & array[i] % 3 != 0 & array[i] % 4 != 0 & array[i] % 5 != 0 &
                 array[i] % 6 != 0 & array[i] % 7 != 0 & array[i] % 8 != 0 & array[i] % 9 != 0 & array[i] > 10) ) {

                System.out.print(array[i] + "  ");
                count++;
            }
        }
        System.out.println("\nКоличество простых чисел: " + count);

    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

}
