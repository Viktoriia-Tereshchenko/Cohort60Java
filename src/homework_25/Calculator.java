package homework_25;
/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции,
принимающие два аргумента и возвращающие результат операции.
*/

public class Calculator {

    public static final double PI = 3.14159; // Константа

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    // Вычисление длины окружности
    public static double circleLength(double radius) {
        return 2 * PI * radius;
    }

    // Вычисление площади круга
    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

}
