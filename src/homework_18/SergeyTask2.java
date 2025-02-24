package homework_18;
/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

import java.util.Arrays;

public class SergeyTask2 {
    public static void main(String[] args) {
        String[] strings = {"One", "Java", "Python", "JS", "Hello"};
        String[] result = gerArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n========== testArray = null / length = 0 =======\n");
        strings = null;
        strings = new String[0];
        result = gerArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n========== null in array =======\n");
        strings = new String[]{"One", "Java", "Python", null, "JS", "Hello"};
        result = gerArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n========== null in array is First =======\n");
        strings = new String[]{null, "One", "Java", "Python", null, "JS", "Hello"};
        strings = new String[]{null, null, null};
        result = gerArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));
    }


    public static String[] gerArrayWithSmallestStrings(String[] strings) {

        if (strings == null || strings.length == 0) {  // если массив пустой, если массив не инициализирован
            // return null;
            return new String[0]; // Возвращаем пустой массив []
        }

        String notNullValue = findFirstNotNullValueInArray(strings);
        System.out.println("notNullValue: " + notNullValue);

        if (notNullValue == null) {
            System.out.println("not-null not found in Array");
            return new String[0]; // []
        }

//        String smallest = strings[0];
//        String biggest = strings[0];

        String smallest = notNullValue;
        String biggest = notNullValue;


        for (int i = 0; i < strings.length; i++) {

            System.out.println("Текущий элемент: " + strings[i]);

            // классический способ избавиться от ошибки с NULL !!!
            // если элемент массива null

            if (strings[i] != null && strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }

            if (strings[i] != null && strings[i].length() > biggest.length()) {
                biggest = strings[i];
            }
        }
        return new String[]{smallest, biggest};
    }

    private static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) return strings[i];

        }
        // Если перебрали массив и не нашли ни одного не-null значения.
        // Тогда возвращаем null из метода
        return null;
    }
}

