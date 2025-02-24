package homework_18;

/*
Task 1
Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}

Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
*/

import java.util.Arrays;

public class SergeyTask1 {
    public static void main(String[] args) {

        int[] test = {0, 1, 2, 3, 4, 5, 6};

        copyOfArray(test, 10);
    }

    public static void copyOfArray(int[] array, int newLength) {

        if (newLength < 0) {
            return;
        }

        int[] result = new int[newLength]; // [0, 0, 0] Массив УЖЕ заполнен НУЛЯМИ !!!

        // Идем по меньшей длине!
        for (int i = 0; i < newLength && i < array.length; i++) {
            result[i] = array[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
