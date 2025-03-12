package homework_32.task2;

import lists.MyArrayList;
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

    Вывод:

    Alice
    Bob
    85
    92
 */

public class MethodApp {
    public static void main(String[] args) {

        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        Method.printTwoLists(names, scores);

        System.out.println("\n========================");

        MyArrayList<Double> numbers = new MyArrayList<>();
        numbers.add(5.3);
        numbers.add(-1.2);

        MyArrayList<Boolean> answers = new MyArrayList<>();
        answers.add(true);
        answers.add(null);

        MyArrayList<Integer> ints = new MyArrayList<>();

        Method.printTwoLists(numbers, answers);
        System.out.println("\n---------------");
        Method.printTwoLists(ints, numbers);

    }
}
