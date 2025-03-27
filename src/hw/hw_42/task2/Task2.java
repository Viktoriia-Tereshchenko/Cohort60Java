package hw.hw_42.task2;

import java.util.Arrays;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args) {

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        Comparator<Integer> comparator = (int1, int2) -> {
            boolean isFirstEven = int1 % 2 == 0;
            boolean isSecondEven = int2 % 2 == 0;
            // 1 / 0 == 0 1 -> -1
            // 1 : 0 -> 1 - 0 -> 1
            // 1: 1; 0 : 0 -> одинаковые
//            if (int1 %2 == int % 2) {
//                return  int1 - int2;
//            }
//            return int1 % 2 - int2 % 2;

            // Четные числа идти перед не четными
            // Т.е. при сравнении четного и нечетного, четное должно признаться меньшим

            if (isFirstEven && !isSecondEven) {
                return -1;
            } else if (!isFirstEven && isSecondEven) {
                return 1;
            } else {
                return Integer.compare(int1,int2);
            }


        };

        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));


    }
}
