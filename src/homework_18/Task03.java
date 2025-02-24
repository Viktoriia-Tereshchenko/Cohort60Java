package homework_18;

public class Task03 {
    public static void main(String[] args) {

/*
Task 3 * (Опционально)
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
*/

        int[] arrayTest1 = {14, 11, 78, 19, 2, 0, -78, 45, 23};
        int[] arrayTest2 = {150, 254, 14, 78};
        int[] arrayTest3 = {};
        printArray(createArraySimpleNumbers(arrayTest1));
        printArray(createArraySimpleNumbers(arrayTest2));
        printArray(createArraySimpleNumbers(arrayTest3));
    }

    public static int[] createArraySimpleNumbers(int[] array) {

        if (array == null || array.length == 0) {
            return new int[0]; // Возвращаем пустой массив
        }

        // найдем количество простых чисел в исходном массиве -> длину нового массива
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkingIsNumberSimple(array[i])) count++;
        }

        if (count == 0) return new int[0]; // простых чисел нет -> пустой массив

        int[] newArray = new int[count];
        int index = 0;

        for (int i = 0; i < newArray.length; i++) {

            for (int j = index; j < array.length; j++) {

                if (checkingIsNumberSimple(array[j])) { // нашли простое число
                    newArray[i] = array[j]; // записали в новый массив
                    index = j + 1; // дальше будем просматривать оставшиеся элементы
                    break;
                }
            }
        }
        return newArray;
    }


    public static boolean checkingIsNumberSimple(int number) {

        boolean isSimple = true;

        // Проверка простое ли число (решето Эратосфена)
        if (number < 2) return !isSimple;
        if (number == 2 || number == 3) return isSimple;
        if (number % 2 == 0 || number % 3 == 0) return !isSimple;

        for (int i = 5; i * i <= number; i += 6) { // i <= Math.sqrt(num)
            if (number % i == 0 || number % (i + 2) == 0) return !isSimple;
        }
        return isSimple;
    }


    // для отладки программы
    public static void printArray(int[] array) {

        if (array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

}
