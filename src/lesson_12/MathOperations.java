package lesson_12;

public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        // Сложение +
        result = 15 + 6;
        System.out.println(result);

        // 1. Сначала происходит вычисления результата справа от знака присвоения
        // 2. Результат вычисления присваивается в переменную слева от знака равно
        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        // Вычитание -
        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        // Умножение *
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

        // Целочисленное деление / (между двумя целыми числами)
        // 20 / 7 -> 2 целые и 6 в остатке (2.85)
        result = var1 / var2;
        System.out.println("var1 / var2 = " + result);

        // Взятие остатка от деления %
        result = var1 % var2;
        System.out.println("var1 % var2 = " + result);

        System.out.println("5 / 10 = " + (5 / 10));
        System.out.println("5 % 10 = " + (5 % 10));

        System.out.println("\n============================\n");

        double doubleVar = 20.0;  // Все числа, записанные с точкой, воспринимаются компилятором, как число в формате double
        double doubleVar2 = 7.0d; // явно указано, что число записано в формате double

        // Знак / между двумя вещественными (дробными) числами - операция "обычного" деления
        // результат с дробной частью
        double doubleRes = doubleVar / doubleVar2;
        System.out.println("doubleRes  = " + doubleRes);

/*
        System.out.println("\n============================\n");
        int var11 = 20;
        double doubleVar11 = 20.0;
        System.out.println(doubleVar11 / var1);
        System.out.println(var11/ doubleVar11);
*/
    }
}
