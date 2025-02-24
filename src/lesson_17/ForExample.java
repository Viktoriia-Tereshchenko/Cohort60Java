package lesson_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        /*

        for ( <Блок инициализации>; < Блок проверок / условие выхода>; <Блок изменений>) {
        // Тело цикла
        }

         */

        // Вывести все числа от 0 до 10
        int j = 0;
        while (j < 10) {
            System.out.print(j + ", ");
            j++;   // j += 1000;
        }
        System.out.println();
        System.out.println("Состояние j после цикла: " + j);


        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Я не вижу локальную переменную i");
        System.out.println("После цикла for");

        // Запустить бесконечный цикл.
        // Для цикла for ни один из блоков НЕ является обязательным
        /*
        for ( ; ; ) {
            System.out.println("Hello, Word");
        }
        */

        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 100_000_000) {
            System.out.print(i1 + ", ");
        }
        System.out.println();
        System.out.println("Состояние переменно i1: " + i1);

        System.out.println("\n============================\n");

        // В блоке инициализации может быть переменная любого типа
        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }

        System.out.println("\n============================\n");

        // Мы можем инициализировать и изменять любое количество переменных
        // в блоках инициализации и/или изменений
        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + ":" + a + ":" + f);
        }

        int z = 1;
        int y = 2;
        // аналогичные записи
        int v = 15, u = 20;

        System.out.println("\n============================\n");
        // Создать массив целых чисел случайной длины от 5 до 15.  // 5 на +5 больше 0
        // Заполнить его случайными значениями ль -50 до 50 включительно. // 0 - 50 -> -50 -> x - 50 = 50; = 50 + 50

        Random random = new Random();
        //int length = random.nextInt(11) + 5;

        System.out.print("[");
        // [0..len-2] -> ", " ; len -1 -> "]\n"

        int[] ints = new int[random.nextInt(11) + 5];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // [-50...50]
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }

         //найти минимальное значение в массиве ints (вывести его в консоль)

        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) min = ints[i];
        }
        System.out.println("Минимальное значение: " + min);

        // continue, break

        for (int i = 0; i < 7; i++) {

            if (i == 3)  continue; // continue - прерывает текущую итерацию цикла и перейти к следующей итерации
            // Мы перейдем в блок изменений переменных (i++) и потом в блок проверки условия
            // В текущей итерации все команды после continue будут пропущены

            System.out.print(i + ", ");
        }


        for (int i = 0; i < 7; i++) {

            if (i == 3)  break; //  break - прекращает текущую итерацию и работу всего цикла
            // Все последующие итерации не буду выполнены (независимо от условия в блоке проверок)
            System.out.print(i + ", ");
        }

    }
}
