package lesson_33;


// Есть два интерфейса Iterable и Iterator
/*
1.  Iterable<T> - означает, что объекты этого класса можно последовательно перебирать (итерироваться по ним)
    Если класс интерпретирует интерфейс Iterable, то он должен реализовать один абстрактный метод iterator()

    Iterator<T> iterator() - возвращает итератор для этого набора элементов (коллекции

2. Iterator<T> - собственное итератор, который позволяет обходить коллекции. Его методы:
    - boolean hasNext() - есть ли следующий элемент
    - T next() - возвращает следующий элемент
    - void remove() - удаляет последний возвращенный элемент (не обязателен для переопределения)
 */

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();
        list.addAll("Hello", "World", "Java", "Python");

        // -------------------------------------------------вариант 1
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
            // iterator.remove(); //без переопределения метода выдает ошибку
        }
        // -------------------------------------------------

        // Цикл for-each - для перебора данных коллекций (наборов данных)
        // При переборе коллекции for-each не рекомендуется изменять коллекцию (добавлять или удалять элементы)

        /*
            for (типПеременной имяПеременной : коллекция) {
                // действие с переменной
            }

            НЕ рекомендуется добавлять и удалить, менять состояние коллекции в таком цикле!
       */

        System.out.println("\n===================");

        // ----------------------------------------------------вариант 2
        for (String strCurrent : list) {
            System.out.println(strCurrent);
        }
        // -------------------------------------------------------

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6);

        // вывести все числа, которые есть в списке, умноженные на 2
        for (Integer intCurrent : integers) {
            System.out.println(intCurrent * 2);
            //if (intCurrent == 3) integers.remove(Integer.valueOf(3));
        }

        for (int i = 0; i < integers.size(); i++) {
            Integer value = integers.get(i);
        }

        System.out.println(integers);

        System.out.println("\n===================");

        // Вывести все элементы массива циклом for-each
        int[] array = {10, 20, 30, 40, 50};

        for (int  element: array) {
            System.out.println(element);
        }
        // Объекты массива Iterable !

    }
}
