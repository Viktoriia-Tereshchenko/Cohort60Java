package homework_43.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MethodsApp {

    private static final int COUNT = 50_000;
    private static final int MAX_VALUE = 1_000;
    private static final int MAX_VALUE2 = 10_000;
    private static final int COUNT_NEW = 2_000;
    private static final int COUNT_REMOVE = 1_000;


    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listArray = new ArrayList<>();
        List<Integer> listLinked = new LinkedList<>();

        for (int i = 0; i < COUNT; i++) {
            int value = random.nextInt(MAX_VALUE + 1);
            listArray.add(value);
            listLinked.add(value);
        }

        // Метод 1
        long timeArrayList = MethodsApp.methodGetByIndex(listArray);
        long timeLinkedList = MethodsApp.methodGetByIndex(listLinked);
        System.out.println("\nПолучение всех значений элементов списка по его индексу");
        System.out.println("Метод1 (ArrayList): " + timeArrayList + " миллисекунд");
        System.out.println("Метод1 (LinkedList): " + timeLinkedList + " миллисекунд");
        System.out.println("--------------------------------------------------------");


        // Метод 2
        timeArrayList = MethodsApp.methodAddByIndex(listArray);
        timeLinkedList = MethodsApp.methodAddByIndex(listLinked);
        System.out.println("\nВставка новых значений по случайному индексу");
        System.out.println("Метод2 (ArrayList): " + timeArrayList + " миллисекунд");
        System.out.println("Метод2 (LinkedList): " + timeLinkedList + " миллисекунд");
        System.out.println("--------------------------------------------------------");

        // Метод 3
        timeArrayList = MethodsApp.methodRemoveByIndex(listArray);
        timeLinkedList = MethodsApp.methodRemoveByIndex(listLinked);
        System.out.println("\nУдаление элементов по случайному индексу");
        System.out.println("Метод3 (ArrayList): " + timeArrayList + " миллисекунд");
        System.out.println("Метод3 (LinkedList): " + timeLinkedList + " миллисекунд");
        System.out.println("--------------------------------------------------------");

        // Метод 4
        timeArrayList = MethodsApp.methodRemoveByValue(listArray);
        timeLinkedList = MethodsApp.methodRemoveByValue(listLinked);
        System.out.println("\nУдаление элементов по значению");
        System.out.println("Метод4 (ArrayList): " + timeArrayList + " миллисекунд");
        System.out.println("Метод4 (LinkedList): " + timeLinkedList + " миллисекунд");
        System.out.println("--------------------------------------------------------\n");


        System.out.printf("Все методы для ArrayList: %d | %d | %d | %d  миллисекунд\n",
                methodGetByIndex(listArray),
                methodAddByIndex(listArray),
                methodRemoveByIndex(listArray),
                methodRemoveByValue(listArray)
                );

        System.out.printf("Все методы для LinkedList: %d | %d | %d | %d  миллисекунд\n",
                methodGetByIndex(listLinked),
                methodAddByIndex(listLinked),
                methodRemoveByIndex(listLinked),
                methodRemoveByValue(listLinked)
        );
     }


    // получение всех значений элементов списка по его индексу
    public static long methodGetByIndex(List<Integer> list) {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();
        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }

    // вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
    public static long methodAddByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        // Тело метода
        Random random = new Random();
        for (int i = 1; i <= COUNT_NEW; i++) {
            int index = random.nextInt(list.size() + 1);
            int newValue = random.nextInt(MAX_VALUE + 1);
            list.add(index, newValue);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    // удалить 1_000 элементов по случайному индексу (диапазон индексов от 0 до размера коллекции)
    public static long methodRemoveByIndex(List<Integer> list) {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
        Random random = new Random();
        for (int i = 1; i <= COUNT_REMOVE; i++) {
            int index = random.nextInt(list.size() + 1);
            list.remove(index);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    // Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
    public static long methodRemoveByValue(List<Integer> list) {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();

        // Тело метода
        Random random = new Random();
        for (int i = 1; i <= COUNT_REMOVE; i++) {
            int value = random.nextInt(MAX_VALUE2 + 1);
            list.remove(Integer.valueOf(value));
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}

/*
Task 2 (* Опционально)
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
Создайте 4 метода, принимающий реализацию интерфейса List.

1. В первом методе - получение всех значений элементов списка по его индексу
2. Второй метод - вставка 2_000 новых значений по случайному индексу
    (диапазон индексов от 0 до размера списка)
3. Третий метод - удалить 1_000 элементов по случайному индексу.
    (диапазон индексов от 0 до размера коллекции)
4. Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)

Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.
И сравните время последовательного выполнения всех методов для каждой реализации List-а.
*/


