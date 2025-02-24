package homework_13;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /*
        Task 3* (Опционально)
        Попросите пользователя ввести строку чётной длины с клавиатуры.
        Распечатайте два средних символа строки.
        Например:
        Для строки "string" результат будет "ri".
        Для строки "code" результат будет "od".
        Для строки "Practice" результат будет "ct".
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку чётной длины: ");
        String str = scanner.nextLine();

        // индексы средних символов
        // первый индекс: длина строки / 2 - 1
        // второй индекс: длина строки / 2
        int len = str.length();
        int index1 = len / 2 - 1;
        int index2 = len / 2;

        char symbol1 = str.charAt(index1);
        char symbol2 = str.charAt(index2);

        // Вариант 1
        System.out.println("Два средних символа: " + symbol1 + symbol2);

        // Вариант 2
        String result = String.valueOf(symbol1).concat(String.valueOf(symbol2));
        System.out.println(result);
    }
}
