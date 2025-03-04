package homework_26;

import java.util.Scanner;

/*
Task 3 * Опционально
Написать метод, который запрашивает у пользователя строку, состоящую из несколько слов
и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)

Например:
научно исследовательский институт -> НИИ
 */

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из несколько слов: ");
        String str = scanner.nextLine();

        System.out.println(MethodAbbreviation.stringAbbreviation(str));
    }
}
