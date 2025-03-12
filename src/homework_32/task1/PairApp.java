package homework_32.task1;

/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
    T getFirst() — возвращает первый элемент.
    T getSecond() — возвращает второй элемент.
    void setFirst(T value) — устанавливает значение первого элемента.
    void setSecond(T value) — устанавливает значение второго элемента.
    void swap() — меняет местами первый и второй элементы.

Пример использования:
    Pair<String> pair = new Pair<>("Hello", "World");
    System.out.println(pair.getFirst()); // Вывод: Hello
    System.out.println(pair.getSecond()); // Вывод: World

    pair.swap();
    System.out.println(pair.getFirst()); // Вывод: World
    System.out.println(pair.getSecond()); // Вывод: Hello
*/

public class PairApp {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World

        pair.swap();
        System.out.println(pair.getFirst()); // Вывод: World
        System.out.println(pair.getSecond()); // Вывод: Hello

        System.out.println(pair.toString());

        System.out.println("\n================================");

        Pair<Double> pairD = new Pair<>(null, null);
        System.out.println(pairD.toString());

        System.out.println(pairD.getFirst());
        System.out.println(pairD.getSecond());

        pairD.setFirst(7.5);
        pairD.setSecond(5.7);
        System.out.println(pairD.toString());

        pairD.swap();
        System.out.println(pairD.toString());

    }

}
