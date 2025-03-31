package homework_45;

import java.util.*;

/*
Task 1
Частотный словарь слов:
Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */
public class Task1 {
    public static void main(String[] args) {

        String string = "JAVA, Java class, Java метод, коллекции в Java";
        System.out.println(frequencyDictionary(string));

        System.out.println("===================================================");

        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    public static Map<String, Integer> frequencyDictionary(String string) {

        if (string == null || string.isEmpty()) return null;

        String[] words = string.replaceAll("[^a-zA-zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return  map;
    }
}
