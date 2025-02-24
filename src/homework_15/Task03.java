package homework_15;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:
- Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
- Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырехзначное число: ");
        String number = scanner.nextLine();

        boolean bol1 = number.length() == 4; // в строке 4 символа

        // преобразование первых 4х символов в цифры
        int symbol1 = number.charAt(0) - '0';
        int symbol2 = number.charAt(1) - '0';
        int symbol3 = number.charAt(2) - '0';
        int symbol4 = number.charAt(3) - '0';

        System.out.println(number.charAt(0));
        System.out.println(number.charAt(0) - '0');


        int sum12 = symbol1 + symbol2;
        int sum34 = symbol3 + symbol4;

        String result = (sum12 == sum34) ? "счастливым" : "несчастливым";

        // каждый из символов - цифра от 0 до 9
        boolean bol2 = symbol1 >= 0 & symbol1 <= 9;
        boolean bol3 = symbol2 >= 0 & symbol2 <= 9;
        boolean bol4 = symbol3 >= 0 & symbol3 <= 9;
        boolean bol5 = symbol4 >= 0 & symbol4 <= 9;

        if (bol1 & bol2 & bol3 & bol4 & bol5) {
            System.out.printf("Введенное число %s является %s числом", number, result);
        } else {
            System.out.println("Ошибка! Введенное значение не является четырехзначным числом.");
        }

    }
}
