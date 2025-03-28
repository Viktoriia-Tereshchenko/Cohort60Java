package homework_44.task2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetUtils {

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new LinkedHashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new LinkedHashSet<>();
        result.addAll(set1);
        result.retainAll(set2);
        return result;
    }


    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new LinkedHashSet<>();
        result.addAll(set1);
        result.removeAll(set2);
        return result;
    }
 }
