package lesson_15;

import java.util.Random;
import java.util.Scanner;

// Ctr + Alt + O  - оптимизация импортов (удалить неиспользованные импорты)

public class IfExample {
    public static void main(String[] args) {

        // Условный оператор if - gjpdjkztn ds,jhjxyj dsgjkyznmjnltkmyst xfcnb ghjuhfvvs (,kjrb rjkf)
        /*

            if (условие) оператор;
            else оператор;


            if (условие) {
                //  Код при условии = True
            } else if (условие 2) {
               //  Код при условии 2= True
            } else {
                // Код при условии = False
            }
         */

        int age = 5;

        if (age > 18) System.out.println("Вы совершеннолетний");
        else System.out.println("Вам меньше 18");

        System.out.println("Продолжение программы");

        if (age > 11) {
            System.out.println("Блок IF");
            System.out.println("Вы уже не ребенок");
        } else {
            // Блок кода else (выполнится, когда условие выдаст false)
            System.out.println("Блок ELSE");
            System.out.println("Сейчас age = " + age);
        }

        System.out.println("\n======================='\n");

        Random rand = new Random();

        int score = rand.nextInt(101); // получить случайное число в диапазоне от 0 до 100

        if (score >= 90) {
            System.out.println("Супер! " + score);
        } else if (score >= 80) {
            System.out.println("Хорошо! " + score);
        } else if (score >= 50) {
            System.out.println("Удовлетворительно " + score);
        } else {
            System.out.println("Плохо! " + score);
        }

        System.out.println("Продолжение программы");

        // Нахождение минимального значения из нескольких чисел

        int v1 = rand.nextInt(51); //случайное число в диапазоне от 0 до 50 включительно
        int v2 = rand.nextInt(51) - 25; // (0...50) -- -0-25 -> 50 - 25 = max = 25;
        int v3 = rand.nextInt(51);

        // -20 до 80 ->
        int r4 = rand.nextInt(101) - 20;
        // r4 = rand.nextInt(10, 70); // в версиях Java 17 и выше, в младших версиях не поддерживается

        //System.out.println(v1 + " | " + v2 + " | " + v3);

        int min = v1;
        if (v2 < min) {
            min = v2;
        }
        if (v3 < min) {
            min = v3;
        }

        System.out.printf("Исходные числа: %d, %d, %d\n", v1, v2, v3);
        System.out.println("min= " + min);

    }
}
