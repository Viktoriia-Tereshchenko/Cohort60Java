package homework_16;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

/*
Task 4 *
Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.
Пример:
567432 -> 5+6+7+4+3+2 -> 27
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        String numberStr = scanner.nextLine();
        String result = numberStr + " -> ";

        int length = numberStr.length();
        int sum = 0;
        int i = 0;

        while (i < length) {
            sum += (numberStr.charAt(i) - 48);
            result += numberStr.charAt(i) + ((i != length - 1) ? "+" : " -> ");
            i++;
        }
        System.out.println(result + sum);
    }
}