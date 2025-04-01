package hw.hw_45;

import java.util.HashMap;
import java.util.Map;

/*
Task 2
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

//Output:
Строка: 2
для: 3
проверки: 3
количества: 2
вхождений: 1
слов: 2
и: 2
теста: 1

Вхождение символов:
'
': 1; ' ': 15; '.': 2; 'С': 2; 'а': 5; 'в': 8; 'д': 4; 'е': 7; 'ж': 1; 'и': 8; 'й': 1; 'к': 7; 'л': 7; 'н': 1; 'о': 10; 'п': 3; 'р': 8; 'с': 5; 'т': 6; 'х': 1; 'ч': 2; 'я': 3;
 */


public class FrequencyDictionary {
    public static void main(String[] args) {

        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

//        Map<String, Integer> frequencyMap = frequencyDictionary(text);
//        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("frequencyDictionary : " + frequencyDictionary2(text));
        System.out.println("frequencyDictionary2: " + frequencyDictionary2(text));
        System.out.println("frequencyDictionary3: " + frequencyDictionary3(text));
        System.out.println("frequencyDictionary4: " + frequencyDictionary4(text));
        System.out.println("frequencyDictionary5: " + frequencyDictionary5(text));

//        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);
//        System.out.println("\nВхождение символов: ");
//        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
//        System.out.println();

    }

    public static Map<Character, Integer> frequencyCharsDictionary(String string) {

        if (string == null || string.isEmpty()) return null;

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : string.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }


    public static Map<String, Integer> frequencyDictionary5(String text) {

        String[] words = text.replaceAll("[^a-zA-zа-яА-Я0-9 ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            /*
            merge(K key, V newValue, BiFunction<K,V> remappingFunction)
            Метод merge используется для объединения значений по ключу
            Как работает:
                - Если ключу нет (или вернул null), новая пара key:newValue вставляется в карту
                - Если ключ еже существует и вернул не-null, примениться функция объединения,
                которая может использовать старое и новое значение
           */
            result.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);
           //result.merge(word, 1, Integer::sum);
        }
        return  result;
    }


    public static Map<String, Integer> frequencyDictionary4(String text) {

        String[] words = text.replaceAll("[^a-zA-zа-яА-Я0-9 ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {

            // computeIfPresent() - вычисляет новое значение, ТОЛЬКО ЕСЛИ ключу было
            // ассоциировано какое-то не-null значение, т.е. если метод get(key) возвращает НЕ null
            result.computeIfPresent(word, (key, value) -> value + 1);

            // result.computeIfAbsent() - метод вычисляет новое значение для ключа, ТОЛЬКО ЕСЛИ ключ
            // не присутствует в карте (или возвращает null)
            // метод сработает, если метод возвращает get(key) null
            result.computeIfAbsent(word, (String key) -> 1);
            // put(word, 1);
        }
        return  result;
    }


    //  Методы merge, compute - методы используются для вычисления новых значений в карте
    // на основе ключа и текущего значения
    public static Map<String, Integer> frequencyDictionary3(String text) {

        String[] words = text.replaceAll("[^a-zA-zа-яА-Я0-9 ]", "").split("\\s+");
        Map<String, Integer> result = new HashMap<>();


        for (String word : words) {

            /*
            compute
            Метод compute позволяет вычислить значение ключа, используя функцию пересчета.
            Новое значение может зависеть от текущего ключа и текущего значения
            Если функция пересчета вернет null, то пара с текущим ключом удаляется из карты
             */
            // key = word;
            // oldValue = result.get(key);
            // oldValue == null -> put(word, 1) : put(word, oldValue + 1)
            // result.compute(word, (String key, Integer oldValue) -> oldValue == null ? 1 : null);
            result.compute(word, (String key, Integer oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }
        return result;
    }


    public static Map<String, Integer> frequencyDictionary2(String text) {

        String[] words = text.replaceAll("[^a-zA-zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебор слов
        for (String word : words) {
            // если ключа не было - вернется null и в переменную будет присвоен 0
            Integer amount = result.getOrDefault(word, 0);
            result.put(word, ++amount);
        }
        return result;
    }


    public static Map<String, Integer> frequencyDictionary(String text) {
        /*
        1. Поместить в какую-то коллекцию слова из текста
        2. Создать карту вхождений -> Слово : кол-воВхождений
        3. Перебирать кол-цию слов: Проверять
            Если слово еть 0 обновить значение (староеЗначение + 1)
            Если слова нет - добавить в карту новую пару ключ-слово со значением 1
         */

        //if (string == null || string.isEmpty()) return null;

        String[] words = text.replaceAll("[^a-zA-zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> result = new HashMap<>();

        // перебор слов
        for (String word : words) {

            //Подробный вариант:

            // Попытаюсь получить значение, ассоциированное текущему слову/ключу
            Integer amount = result.get(word);

            // Если такого ключа нет - вернется null
            if (amount == null) amount = 0;

            // Увеличиваю значение на 1
            amount = amount + 1;

            // Записать в карту новую пару или обновить значение
            result.put(word, amount);


        }
        return result;
    }
}