package hw.hw_25;

// Версия ДЗ 25 Сергея (учителя)

/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции,
принимающие два аргумента и возвращающие результат операции.
*/

// Lombok

public class Calculator25S {

    /*
    1. Поля класса, в том числе константы
    2. Блоки инициализации, если есть
    3. Конструктор/-ы, если они есть
    4. Метода (статические и нестатические обычно не разделяются)
     */

    public static final double PI = 3.14159; // Константа

    public static double circlePerimeter(double radius) {
        return 2 * PI * radius;
    }

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }


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

}
