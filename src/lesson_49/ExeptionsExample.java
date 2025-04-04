package lesson_49;

import java.net.MalformedURLException;
import java.net.URL;

public class ExeptionsExample {

    public static void main(String[] args) {

        // Ошибки компиляции -

//        int a = "Java";  // некорректный тип данных
//        int x = 10      // пропустили ;

        // Ошибки Runtime (время выполнения)

        int[] array = {1, 23, 4};
//        array[10] = 100;          // java.lang.ArrayIndexOutOfBoundsException
//        int x = 10 / 0;           // java.lang.ArithmeticException

        try {
            array[2] = 10;
            System.out.println("Try continue");
            //array[10] = 100;
            System.out.println("Try continue #2");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayException: " + exception.getMessage()); //Что-то не так с индексом
        } catch (Exception ex) {
            System.out.println("Какая-то ошибка");
            ex.printStackTrace();
        } finally {
            System.out.println("Finally");
        }


        System.out.println("Продолжение работы программы");
        System.err.println("Печатаю в потоке ошибок");


        // Exception (исключения) - представляют собой события, которые могут возникнуть
        // во время выполнения программы и нарушить ее нормальное выполнение

        // Исключения в Java является объектом определенного класса, который наследуется
        // от класса Throwable().

        // Обработка ошибок - предусмотреть возможность появления Exception (объекта определенного класса)
        // и написать какой-то код, который будет выполнен в этом случае

        /*

        try -catch

        try {
            // код, который может вызвать исключение
        } catch (ExceptionType name) {
            // код для обработки исключения
            // код, который будет выполнен при возникновении объекта определенного класса
        } catch (AnotherExceptionType ex2) {
            // код для обработки другого исключения
        } finally {
            // код, который будет выполнен в ЛЮБОМ случае перед выходом из конструкции  try -catch
        }

        Перечисляем catch от более точных до последнего самого обобщенного, т.е. в конце можем написать catch (Exception ex)
         */

        // Методы Exception
        // .getMessage() - краткое сообщение об ошибке
        // .printStackTrace();  - вывести стандартный КРАСНЫЙ текст ошибки в консоль, но программа не останавливается

        // System.err.println  - печать в потоке ошибок


        // Проверяемые (checked exception) и непроверяемые исключения

        // Проверяемые (checked exception) - это тип исключения, наличие которых вы обязаны проверить и обработать.
        // Непроверяемые исключения - это исключения, возможность появление которых я не обязан обрабатывать в коде.

        System.out.println("=================================");
        String result = getUrlString();
        System.out.println("result: " + result);

        System.out.println("=================================");
        String resul2;
        try {
            resul2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: " + e.getMessage());
            resul2 = "https://www.google.com";
        }
        System.out.println("resul2: " + resul2);
    }

    private static String getUrlString() {
        URL myUrl = null;

        // бросает проверяемое исключение
        try {
            myUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            //throw new RuntimeException(e);
            System.out.println("Неверный формат URL: " + e.getMessage());
            return "https://www.google.com";
        }

        return myUrl.toString();
    }

    // Ключевое слово throws используется в сигнатуре метода для указания, что метод может выбросить исключение
    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = new URL("htt://example.com");
        return myUrl.toString();

    }
}
