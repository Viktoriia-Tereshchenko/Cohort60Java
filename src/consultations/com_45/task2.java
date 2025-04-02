package consultations.com_45;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task2 {

/*
Task 1
Частотный словарь слов:

Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.

Task2 (*Опционально):
Напишите метод, возвращающий частотный словарь вхождения символов в строку

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }
 */
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);
        Map<Character, Integer> frequencyCharsMap2 = frequencyCharsDictionary2(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
        System.out.println("=================================");
        frequencyCharsMap2.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        /*
        1. Поместить в какую-то коллекцию символы из текста
        2. Создать карту вхождений слов -> символ : кол-воВхождений
        3. Перебирать кол-цию символов: Проверять
            Если символ есть - обновить значение (староеЗначение + 1)
            Если символа нет - добавить в карту новую пару ключ-символ со значением 1
         */

        Map<Character, Integer> result = new HashMap<>();
//
        // Возвращает массив символов, из которых состоит строка.
//        char[] chars = text.toCharArray();
//        System.out.println(Arrays.toString(chars));

        for (Character ch : text.toCharArray()) {


            // map.put(ch, 1) если такого ключа в мапе еще нет
            // такой ключ. put(ch, результатРаботыФункции)

            // такой ключ. put(ch, 1000) результатРаботыФункции)
            result.merge(ch, 1, (oldValue, newValue) -> oldValue + 1);
        }

        return result;
    }

    private static Map<Character, Integer> frequencyCharsDictionary2(String text) {
        Map<Character, Integer> result = new HashMap<>();

        for (Character ch : text.toCharArray()) {

            // put(ch, результатРаботыФункции) - выполнится метод
            // get(ch)
            // (ключ, значение) ->
            // 1. old == null ? ключа еще не было (или ключ был, но значение null) -> put(ch, 1)
            // 2. Иначе (old != null) - put(ch, oldV + 1)
//            result.compute(ch, (key, oldValue) -> {
//               if (oldValue == null) {
//                   return  1;
//               }
//               return oldValue + 1;
//            });

            result.compute(ch, (key, oldV) ->  oldV == null ? 1 : oldV + 1);
        }

        return result;
    }

}
