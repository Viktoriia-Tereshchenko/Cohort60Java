package homework_25;

/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу

Класс должен содержать:

- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)

 */

public class Task01 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(5, 4));
        System.out.println(Calculator.add(-1.5, 4.3));

        System.out.println(Calculator.subtract(9.5, 4.8));
        System.out.println(Calculator.subtract(-1, 4));

        System.out.println(Calculator.multiply(11, 4));
        System.out.println(Calculator.multiply(9.9, 10));

        System.out.println(Calculator.divide(9.9, 10));
        System.out.println(Calculator.divide(9.9, 0));

        System.out.println(Calculator.PI);

        System.out.println(Calculator.circleLength(5));
        System.out.println(Calculator.circleArea(1.5));
        System.out.println(Calculator.circleArea(4));
    }

}
