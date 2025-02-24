package lesson_16;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array; // Объявление массива целых чисел
        //int array1[]; // Альтернативный способ объявления
        String[] strings; // Объявляем массив строк

        array = new int[4]; // создали (инициализировали) массив типа int c 4 ячейками
        strings = new String[10]; // создали массив строк на 10 ячеек

        int[] array2 = new int[8]; // Объявление и инициализировали массива типа int на 8 ячеек
        boolean[] bools = new boolean[3];

        // Получить из массива значение, находящееся в ячейке с индексом 0
        int value = array2[0]; // получение значения по индексу
        System.out.println("array2[0]: " + value);  // 0
        System.out.println("array2[7]: " + array2[7]);  // 0

        System.out.println("bools[1]: " + bools[1]);
        System.out.println("strings[9]: " + strings[9]);

        /*
        Значения по умолчанию для типа данных.
        1. Для всех числовых типов (int, double, long,..., в том числе char) это будет 0 (0.0)
        2. Для boolean - false
        3. Для ссылочных типов данных это будет null (нал)
         */

        // Распечатать все значения в массиве так не получится !
        System.out.println(array2); // получим ссылку на адрес памяти Heap (где хранятся значения)

        // Явная инициализация массива значениями
        int[] numbers = new int[]{45, 56, -16, 0, 159};  // будет создан массив размером = количеству элементов в {} скобках
        int[] ints = {-10, 54, 32333, 444}; // короткая форма явной инициализации

        int val = numbers[0];
        System.out.println("numbers[0]: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100; // присвоение нового значения

        int len = numbers.length; // длина массива (кол-во ячеек в массиве)
        System.out.println("len: " + len);


        // Перебрать индексы от 0 до len - 1
        System.out.println("Вывести все значения массива");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();


        System.out.println("\n===================\n");

        // создать массив из 10 элементов и заполнить его случайными числами от 0 до 100 вклю-но

        Random random = new Random();

        int[] num = new int[10];
        i = 0;
        System.out.print("[");
        while (i < num.length) {
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]");
        System.out.println("С новой строки");

        // Найти минимальное значение в массиве
        i = 0;
        int min = num[0];
        while (i < num.length) {
            if (num[i] < min) {
                min = num[i];
            }
            i++;
        }
        System.out.println("Минимальное значение: " + min);

    }
}
