package homework_47;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Дан список строк.
Используя Stream API, отфильтруйте строки, которые начинаются
на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.
Результат сохраните в новый список строк.
 */
public class Task2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("Comparator", "Java", "Class", "Python", "JS", "Collection", ""));
        strings.add(null);

        System.out.println(stringsFiltering(strings, "c"));
    }

    public static List<String> stringsFiltering(List<String> strings, String firstLetter) {

        List<String> result = strings.stream()
                .filter(Objects::nonNull)
                .filter(str -> !str.isEmpty())
                .filter(str -> String.valueOf(str.charAt(0)).equalsIgnoreCase(firstLetter))
                .sorted()
                .collect(Collectors.toList());

        return result;
    }
}
