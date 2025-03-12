package lesson_32.lesson_lists;

import lists.MyArrayList;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        MyArrayList<Integer> list = new MyArrayList<>();

        Integer[] arr = list.toArray(); // вернется null
        System.out.println(Arrays.toString(arr));

        System.out.println(list);
        list.add(10);
        list.addAll(20, 30, 40, 50);
        //list.add("54554");  // ошибка - обеспечивается безопасность типов на этапе компиляции


        System.out.println(list);

        Integer[] array = list.toArray();

        // Стирание типов при работе с дженериками
        // Type Erasure - процесс ...
        /*
        Во время компиляции:
        1. Проверка типов.
        2. Стирание типов: удаление информации о параметрах типов
        3. Добавление приведения типов, гже это необходимо
         */




    }
}
