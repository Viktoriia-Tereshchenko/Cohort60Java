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

public class Task01 {
    public static void main(String[] args) {

        int[] arrayTest = {1, 2, 3, 4, 5};
        copyOfArray(arrayTest, -8);
        copyOfArray(arrayTest, 0);
        copyOfArray(arrayTest, 3);
        copyOfArray(arrayTest, 5);
        copyOfArray(arrayTest, 11);
        int[] arrayTest2 = new int[0];
        copyOfArray(arrayTest2, 3);
    }

    public static void copyOfArray(int[] array, int length) {

        if (array == null || length <= 0) {
            System.out.println("[]");
            return;
        }

        int[] newArray = new int[length];

        System.out.print("[");
        for (int i = 0; i < length; i++) {

            if (i < array.length) newArray[i] = array[i];
            else newArray[i] = 0;

            System.out.print(newArray[i] + (i != length - 1 ? ", " : "]\n"));
        }
    }

}


