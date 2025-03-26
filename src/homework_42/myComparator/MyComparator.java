package homework_42.myComparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer int1, Integer int2) {

        // int1 - четное , int2 - нечетное
        // int1 < int2 ->  int1 - int2 = -1
        if (int1 % 2 == 0 && int2 % 2 != 0) return -1;

        // int1 - нечетное , int2 - четное
        // int1 > int2 ->  int1 - int2 = +1
        if (int1 % 2 != 0 && int2 % 2 == 0) return 1;

        // int1,int2 - четные  или  int1,int2 - нечетные
        // по возрастанию
        return int1.compareTo(int2);
    }
}
