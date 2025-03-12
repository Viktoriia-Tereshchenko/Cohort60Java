package homework_32.task2;

import lists.MyArrayList;

public class Method {

    public static <T, U> void printTwoLists(MyArrayList<T> list1,  MyArrayList<U> list2) {

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (int j = 0; j < list2.size(); j++) {
            System.out.println(list2.get(j));
        }
    }

}
