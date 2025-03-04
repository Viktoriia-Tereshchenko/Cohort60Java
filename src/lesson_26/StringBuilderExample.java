package lesson_26;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        // StringBuilder - это класс, который используется для создания и манипулирования
        // изменяемыми строками

        // Перегруженный конструктор. Может быть пустым, может применять String
        StringBuilder sb = new StringBuilder(); // пустой конструктор
        sb = new StringBuilder("Hello");

        // Метод для добавления в конец строки (приклеивание справа). Аналог конкатенации.
        sb.append(" "); // "Hello" + " ";

        // Получить строковое предоставление
        String string = sb.toString();
        System.out.println(string);

        System.out.println(sb); // автоматически вызывается sb.toString()

        // Вставить символы в указанную позицию
        sb = new StringBuilder("Hello World"); // Hello beautiful World
        sb.insert(6, "beautiful ");
        System.out.println(sb);

//        String start = "Hello World";
//        String result = start.substring(0, 6);
//        result += "beautiful ";
//        result += start.substring(6);
//        System.out.println(result);


        // Заменить подстроку (определяется индексами) на указанное значение
        sb = new StringBuilder("Hello World!"); // "Hello Java"
        sb.replace(6, 11, "Java"); // замени мне все, что было с [6;11) индексы на "значение"
        System.out.println(sb);


        // Удалить подстроку в диапазоне от start (вкл) до end (не вкл)
        sb = new StringBuilder("Hello World!");
        sb.delete(5, 11);
        System.out.println(sb);


        System.out.println("\n============index==============");

        // Нам надо знать, есть ли в sb какая-то подстрока
        // Положительный индекс, если нашел, и -1 - если не нашел
        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println(index);

        index = sb.lastIndexOf("Java");
        System.out.println(index);

        System.out.println("\n===========reverse=============");

        // Реверс - разворачивает последовательность символов
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb);

        // Получить символ по индексу
        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        // Количество символов в sb (длина)
        System.out.println("length: " + sb.length());

        // Я могу установить новую длину (обрезать или расширить sb)
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена char с кодом 0
        System.out.println(sb);
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8) code: " + (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb);
        System.out.println(sb.length());

        // TODO homework +
        /*
        Написать метод, который запрашивает у пользователя строку, состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы (первые буквы каждого слова, записанные в верхнем регистре)

        научно исследовательский институт -> НИИ
         */

        String example = String.join(" ","Java","is","the","best");
        System.out.println(example);
        // разделение строки на подстроки / слова между указанным разделителем
        String[] words = example.split(" ");
        System.out.println(Arrays.toString(words));

        String str1 = "fstgws ggtgtwr";
        // получить массив символов, из которых состоит строка
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));

    }
}
