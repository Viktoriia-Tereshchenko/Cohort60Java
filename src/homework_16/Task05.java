package homework_16;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {

/*
Task 5
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
*/
        Random random = new Random();

        int length = random.nextInt(11) + 5; // произвольная длина массива от 5 до 15
        int[] numbers = new int[length];            // массив целых чисел

        String arrayStr = "Исходный массив: [ ";       // для вывода массива на экран
        int i = 0;

        while (i < length) {
            numbers[i] = random.nextInt(101) - 50; // случайные значения от -50 до 50
            arrayStr += numbers[i] + ((i != length - 1) ? ", " : " ]");
            i++;
        }

        arrayStr += " из " + length + " чисел";

        System.out.println(arrayStr);

        // поиск min, max, среднего значений
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        double average;

        i = 0;
        while (i < length) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
            sum += numbers[i];
            i++;
        }

        average = (double) sum / length;

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.printf("Среднее арифметическое всех значений в массиве: %.2f\n", average);
    }
}
