package homework_44.task3;

import java.util.*;

public class StrUtil {

    public static String getFirstUniqueChar(String string){

        if (string == null || string.isEmpty()) return null;

        Set<Character> allSymbolsArray = new LinkedHashSet<>();
        Set<Character> duplicatesSymbolsArray = new LinkedHashSet<>();

        for (char ch : string.toCharArray()) {
            if (allSymbolsArray.contains(ch)) {
                duplicatesSymbolsArray.add(ch);
            } else {
                allSymbolsArray.add(ch);
            }
        }

        allSymbolsArray.removeAll(duplicatesSymbolsArray);

        // Получаем первый элемент с помощью итератора
        Iterator<Character> iterator = allSymbolsArray.iterator();
        if (iterator.hasNext()) {
            return String.valueOf(iterator.next());
        }
        return null;
    }
}

