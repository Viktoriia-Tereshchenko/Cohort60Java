package homework_17;

/*
Task 4 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти,
и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.

Простое число - положительное число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 2, 3, 5, 7, 11, 13 и т.д.
Числа 0, 1 - НЕ простые числа !
 */

import java.util.Random;

public class SergeyTask04 {
    public static void main(String[] args) {

        int range = 20;
        int[] numbers = new int[range];

        fillArray(numbers);
        printArray(numbers);

        System.out.println("\n======================\n");
        System.out.print("Найдены простые числа: ");

        long v1 = 0;
        long v2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i]; // число, которое проверяем на каждой итерации цикла

            boolean isSimple = true;

            // Проверка числа на простоту
            if (num < 2) continue; // число не является простым, берем следующее

            // МЕТОД простого перебора всех---------------
            // перебор от 1 ^ -1 до 10 ^ -1
            for (int j = 2; j < num; j++) {
                v1++;
                if (num % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            // ---------------------------------------------


            // решето Эратосфена -------------------
            if (num == 2 || num == 3) {
                // Число простое. Переходим к следующему
                // Но сначала надо учесть
                System.out.println(num + ", ");
                continue;
            }

            if (num % 2 == 0 || num % 3 == 0) {
                isSimple = false; // число не является простым
                continue;
            }

            for (int k = 5; k * k <= num; k += 6) { // k <= Math.sqrt(num)
                v2++;
                if (num % k == 0 || num % (k + 2) == 0) {
                    isSimple = false;
                    break;
                }
            }
            // --------------------------------------


            if (isSimple) {
                // число прошло проверку, isSimple осталось true
                System.out.print(num + ", ");
            }
        }

        System.out.println();
        System.out.println("v1 = " + v1);
        ;
        System.out.println("v2 = " + v2);
        ;

    }

    public static void fillArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11100) - 10; // - 100...9_900

        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }
}
