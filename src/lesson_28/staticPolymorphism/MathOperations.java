package lesson_28.staticPolymorphism;

/*
В Java полиморфизм проявляется в двух формах:

Статический (компиляционный) полиморфизм - реализуется с помощью перегрузки методов (Method Overloading).
Метод определяется на этапе компиляции в зависимости от типа данных параметров

Динамический (исполнительный) полиморфизм - реализуется через переопределение методов (Method Overriding).
 */


// Статический  полиморфизм

public class MathOperations {


    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }

// ---------------------------------------------------------

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
