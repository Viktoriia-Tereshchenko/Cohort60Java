package lesson_31.generics;

public class Wrappers {

    // Классы - обертки используются для представления примитивных типов как объектов (как ссылочных)

    /*
    Примитивные типы данных (8 шт)

    Byte - обертка byte
    Short - обертка short
    Integer - обертка int   !
    Long - обертка long
    Float -  обертка float
    Double - обертка double
    Character - обертка char    !
    Boolean - обертка boolean
     */

    // Обертки чисел могут вернуть null !!!

    public static void main(String[] args) {

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

        // Поддержка null
        //int x = null; // ошибка!
        maxValue = null;

        // Приведение типов. Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // Автоупаковка примитва int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка. Из типа Integer автоматически преобразовано в примитив int
        System.out.println(primitiveInt);

        System.out.println("\n=============================");

        // Сравнение объектов ПО ЗНАЧЕНИЮ - следует использовать метод equals
        // -128...127 - Кеширование (новый объкт не создаем

        Integer a = 127; //  Создан объект с адресом в памяти @2aaa2
        Integer b = 127; // Объект с таким значением уже есть. Новый не создается, ведается ссылка @2aaa2 на уже существующий

        // Сравниваем значения, записанные в переменных (т.е. ссылки - адреса объектов в памяти)
        System.out.println("127 == 127: " + (a == b)); // true
        System.out.println("127.equals(127): " + a.equals(b)); // true

        Integer c = 128; // Создан объект с адресом в памяти @3bbb3
        Integer d = 128; // Создан объект с адресом в памяти @4ссс4. Не проверяется на наличие объекта с таким значением.
        System.out.println("128 == 128: " + (c == d)); // false
        System.out.println("128.equals(128): " + c.equals(d)); // true

        System.out.println("\n=============================");

        // Общие (или схожие) методы, которыми обладают классы-обертки:
        // TODO

    }

}
