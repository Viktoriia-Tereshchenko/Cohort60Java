package homework_13;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

    /*
    Task 1
    Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
    Используя Scanner, сохраните имя в переменную типа String.
    Выведите на экран количество символов в имени пользователя.
    Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
    Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
    */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String userName = scanner.nextLine();
        // запомним длину имени
        int symbol = userName.length();
        System.out.printf("%s, в вашем имени %d символов\n", userName, symbol);

        char firstSymbol = userName.charAt(0);
        char lastSymbol = userName.charAt(symbol - 1);
        System.out.printf("10-й код первой буквы %c : %d\n", firstSymbol, (int) firstSymbol);
        System.out.printf("10-й код последней буквы %c : %d\n", lastSymbol, (int) lastSymbol);

    }
}
