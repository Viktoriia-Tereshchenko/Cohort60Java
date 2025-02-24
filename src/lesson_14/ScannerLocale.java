package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        //String data = "3,14 42,7";
        String data = "3.14 42.7";
        Scanner sc = new Scanner(data);

        // настройка локали
        sc.useLocale(Locale.US);
        //sc.useLocale(Locale.GERMANY);

        // Locale - используется локаль вашей системы для определения формата чисел.
        // В том числе каким знаком отделяется дробная чисть числа

        // Locale.US - дробная часть отделяется точкой (.)
        // Locale.GERMANY - дробная часть отделяется запятой (,)

        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());


        // Узнать, какая локаль сейчас у меня на компьютере
        System.out.println(Locale.getDefault());


        System.out.println("\n================================\n");

        String text = "42,Java,3.14,Hello";
        Scanner scanner = new Scanner(text);
        scanner.useLocale(Locale.US);   // Устанавливаем для сканера локаль
        //scanner.useDelimiter(","); // задаем разделитель
        scanner.useDelimiter("[;|]"); // Разделитель ; или |
        scanner.useDelimiter("\\s*,\\s*"); // Разделитель ; или |

        System.out.println(scanner.next());
        String java = scanner.next(); // считает ОДИН токин, возвращает String - строку
        System.out.println(java);
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());

        scanner.reset();  // Вернуться к стандартному разделителю
    }

}
