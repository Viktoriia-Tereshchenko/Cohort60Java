package lesson_13;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        // Строка подготавливает программу для чтения данных из стандартного потока ввода
        // от пользователя через клавиатуру

        Scanner scanner = new Scanner(System.in);

        // Причитать строку
        System.out.println("Введите ваше имя: ");
        // читает всю строку, введенную пользователем, и возвращает ее в виде типа данных string
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);

        // Причитать число
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();  // считает одно число типа int
        // Всегда после вызова методов nextInt, nextDouble, next() и т.д.
        // следует вызвать метод scanner.nextLine() , чтобы "скушать" остаток строки
        scanner.nextLine();
        System.out.println("Age: " + age);

        System.out.println("Введите город: ");
        String city = scanner.nextLine();
        System.out.println("City: " + city);

        // Todo Чтение токенами чисел

        // Разделить - пробельный символ
        /*
            \s+ - пробельный символ в регулярных выражениях
            - пробел (в любом количестве подряд)
            - \t знак табуляции (подряд)
            - \n перевод каретки
            - \r возврат каретки
         */


        System.out.println("Введите число PI: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pi: " + pi);

    }
}
