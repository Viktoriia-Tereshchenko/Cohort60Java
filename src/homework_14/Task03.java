package homework_14;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

/*
Task 3
1.Попросите пользователя ввести целое число с клавиатуры.
2.Ваша программа должна вывести строку в формате:
    Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
    Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
3.Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        boolean bol1 = number % 2 == 0; // число четное
        boolean bol2 = number % 3 == 0; // число кратно 3
        boolean bol3 = bol1 & bol2; // число четное и кратное 3

        System.out.printf("Число: %d четное: %b; кратно 3: %b; четное и кратное 3: %b\n", number, bol1, bol2, bol3);
    }
}
