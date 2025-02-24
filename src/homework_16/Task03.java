package homework_16;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

/*
Task 3 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello".
Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова,
и выведите это количество на экран.
 */
        Scanner scanner = new Scanner(System.in);

        int count = 0; // количество попыток
        String word = "hello";
        String userWord;

        do {
            System.out.println("Введите слово \"hello\": ");
            userWord = scanner.nextLine();
            count++;
        } while (!userWord.equals(word));

        System.out.println("Спасибо, вы ввели правильное слово! Количество попыток: " + count);
    }
}
