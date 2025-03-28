package homework_44.task2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Task 2
Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами.
Некоторые слова должны повторяться в обоих множествах.

Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество,
содержащее все уникальные элементы из обоих множеств (объединение множеств).

Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество,
содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).

Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов,
которые есть в первом множестве, но отсутствуют во втором (разность множеств).

Результат каждого метода необходимо выводить в консоль для наглядности.
Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов операций.

Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

System.out.println(SetUtils.union(set1, set2));
System.out.println(SetUtils.intersection(set1, set2));
System.out.println(SetUtils.difference(set1, set2));

// Output:
[A, B, C, D, E, F]
[C, D]
[A, B]
 */
public class Task2 {
    public static void main(String[] args) {

    Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
    Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

    System.out.println(SetUtils.union(set1,set2));
    System.out.println(SetUtils.intersection(set1,set2));
    System.out.println(SetUtils.difference(set1,set2));

    }
}
