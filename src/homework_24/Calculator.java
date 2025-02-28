package homework_24;
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

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {

        return (number2 != 0) ? number1 / number2 : Double.NaN;

        // Обработка ошибки "Деление на 0", варианты:
        // return 0; // или другое значение для обработки
        // return throw new ArithmeticException("Ошибка! Деление на ноль!");
        // return Double.NaN;
    }
}
