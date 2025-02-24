package homework_14;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {

/*
Task 2
Создайте две переменные типа int.
В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:
- равны ли переменные,
- не равны ли они,
- больше ли a, чем b,
- и меньше ли b, чем a.
Выведите результат на экран.
 */

        int a;
        int b;
        boolean result;

        Random random = new Random();
        a = random.nextInt(51); // случайное значение от 0 до 50
        b = random.nextInt(101); // случайное значение от 0 до 100

        result = a == b;
        System.out.printf("%d == %d : %b\n", a, b, result);

        result = a != b;
        System.out.printf("%d != %d : %b\n", a, b, result);

        result = a > b;
        System.out.printf("%d > %d : %b\n", a, b, result);

        result = b < a;
        System.out.printf("%d < %d : %b\n", b, a, result);

        b = random.nextInt(51) - 20; // случайное значение от -20 до 30
        System.out.println("\n=====================\n");
        System.out.printf("%d == %d : %b\n", a, b, a == b);
        System.out.printf("%d != %d : %b\n", a, b, a != b);
        System.out.printf("%d > %d : %b\n", a, b, a > b);
        System.out.printf("%d < %d : %b\n", b, a, b < a);
    }
}
