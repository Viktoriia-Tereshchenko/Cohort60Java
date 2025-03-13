package hw_32.task1;

// версия учителя

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
public class Pair <E>{

    private E first;
    private E second;

    public Pair(E value1, E value2) {
        this.first = value1;
        this.second = value2;
    }

    public E getFirst()  {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public void swap() {
        E temp = first;
        first = second;
        second = temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "Java");
        System.out.println(pair);

        pair.swap();
        System.out.println(pair);
    }
}
