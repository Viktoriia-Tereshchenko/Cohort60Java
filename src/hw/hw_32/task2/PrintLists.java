package hw.hw_32.task2;

// версия учителя
/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два
параметра типа MyArrayList и MyArrayList<U>, и выводит элементы обоих списков.

Требования:
    Метод должен быть обобщенным по двум типам T и U.
    Элементы списков могут быть разных типов.

Пример использования:

    MyArrayList<String> names = new MyArrayList<>();
    names.add("Alice");
    names.add("Bob");

    MyArrayList<Integer> scores = new MyArrayList<>();
    scores.add(85);
    scores.add(92);

    printTwoLists(names, scores);

 */

import lists.MyArrayList;
import lists.MyList;

public class PrintLists {

    public static <T, U> void printTwoLists(MyList<T> list1, MyList<U> list2) {
        // вывожу элементы 1-го списка
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // вывожу элементы 2-го списка
        for (int j = 0; j < list2.size(); j++) {
            System.out.println(list2.get(j));
        }
    }

    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        printTwoLists(names, scores);
    }
}
