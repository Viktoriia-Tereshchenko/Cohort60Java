package homework_15;

import java.util.Scanner;

public class SergeyTask03 {
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
        String digitStr = scanner.nextLine();

        if (digitStr.length() !=4) {
            System.out.println("Сообщение об ошибке");
        } else {

            // 0..9 -> 48..57
            // можно отнять 48  -> digitStr.charAt(0) - 48
            // можно отнять КОД нуля -> digitStr.charAt(0) - '0'


            // Логика обработки строки
            int digit0 = digitStr.charAt(0) - 48;
            int digit1 = digitStr.charAt(0) - '0';

            // if (d0 + d1 == d2 + d3)

            if (digitStr.charAt(0) < 48 || (digitStr.charAt(0) > 57)) {
                System.out.println("Все пропало!");
                System.exit(0);
            }


             // Минимальное решение!!!!!

            if (digitStr.charAt(0) + digitStr.charAt(1) == digitStr.charAt(2) + digitStr.charAt(3)) {
                System.out.printf("Я хочу использовать цифры %s + %s \n", digitStr.charAt(0), digitStr.charAt(1));
                System.out.println("счастливое");
            } else {
                System.out.println("не счастливое");
            }

        }

        System.out.println("\n ========= Opt 2======== ");

        if (digitStr.length() == 4) {
            // Код обработки строки. Вариант 2
            int input = Integer.parseInt(digitStr);
            System.out.println("Я получил число из строки: " + (input + 1));

            // 1234
            int digit3 = input % 10;
            input = input / 10;

            // 123
            int digit2 = input % 10;
            input = input / 10;

            // 12
            int digit1 = input % 10;
            int digit0 = input / 10;

            String result = (digit0 + digit1 == digit2 + digit3) ? "счастливое" : "НЕ является счастливым";

            System.out.printf("Число %s -> (%d+%d) = %d; (%d+%d) = %d;  - число %s." ,
                    digitStr, digit0, digit1, digit1+digit0, digit2, digit3, digit2+digit3, result);


        } else {
            System.out.println("Длина строка не 4 символа");
        }


    }
}
