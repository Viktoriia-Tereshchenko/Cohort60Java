package homework_43.task1;

/*
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionMethod {


    public static <T> List<T> intersectionTwoLists(List<T> list1, List<T> list2) {

        List<T> resultList = new ArrayList<>();
        List<T> helpList = list2;

        for (T value : list1) {
            if (helpList.contains(value)) {
                resultList.add(value);
                helpList.remove(value);
            }
        }
        return resultList;
    }


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1, 1, 3, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(1, 3, 5, 5, 5, 9));
        System.out.println(intersectionTwoLists(list1, list2));  // результат [1, 3, 5]

        list1.clear();
        list1.addAll(List.of(0, 0, 0, -9, 5));
        list2.clear();
        list2.addAll(List.of(-3, -3, 1, 6, 9));
        System.out.println(intersectionTwoLists(list1, list2));  // результат []

        list1.clear();
        list1.addAll(List.of(1, 2, 3, 4, 5));
        list2.clear();
        list2.addAll(List.of(9, 8, 7, 6, 5));
        System.out.println(intersectionTwoLists(list1, list2));  // результат [5]

        List<String> l1 = new ArrayList<>(List.of("A", "AA", "B", "BB"));
        List<String> l2 = new ArrayList<>(List.of("AA", "AA", "B", "B"));
        System.out.println(intersectionTwoLists(l1, l2));  // результат ["AA", "B"]
    }
}
