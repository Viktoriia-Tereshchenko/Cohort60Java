package hw.hw_46;

/*
Task 1
Пересечение двух карт:
Реализуйте метод, который принимает две карты Map<String, Integer>
и возвращает новую карту, содержащую только те записи, ключи которых
присутствуют в обеих исходных картах.

Для совпадающих ключей значение можно брать из любой карты

 Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

//Output
banana: 20
cherry: 30
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println(intersection2(map1, map2));
        System.out.println(intersection3(map1, map2));
    }

    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>();

        Set<String> keySet1 = map1.keySet();
        // Оставить в сете ключи, которые есть в обоих сетах - retainAll
        for (String key1 : keySet1) {
            if ((map2.containsKey(key1))) {
                result.put(key1, map1.get(key1));
            }
        }
        return  result;
    }

    public static Map<String, Integer> intersection2(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>();

        Set<String> keySet1 = map1.keySet();
        keySet1.removeAll(map2.keySet());
        for (String key1 : keySet1) {
            result.put(key1, map1.get(key1));
        }
        return  result;
    }

    public static Map<String, Integer> intersection3(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>(map1);
        Set<String> keySet1 = result.keySet();
        keySet1.retainAll(map2.keySet());
        return result;
    }
}
