package hw_24;
// Версия ДЗ 24 Сергея (учителя)

/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
*/

public class CalculatorS {

    public static int add(int i1, int i2) {
        return i1 + i2;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        //if (b == 0) return Integer.MAX_VALUE;
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a + b;
    }


}
