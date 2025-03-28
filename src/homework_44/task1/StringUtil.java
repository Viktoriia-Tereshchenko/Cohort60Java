package homework_44.task1;
import java.util.*;

public class StringUtil {

    public static SortedSet<String> getUniqueSortedWords(String string) {

        String newString = string.replaceAll("[^a-zA-zа-яА-Я0-9 ]", "");
        String[] words = newString.split("\\s+");

        List<String> list = Arrays.asList(words);
        SortedSet<String> result = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        result.addAll(list);

        return  result;
    }
}
