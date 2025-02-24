package homework_18;

public class Task02 {
    public static void main(String[] args) {

/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */

        String[] arrayTest1 = {"Java", "is", "interesting"};
        String[] arrayTest2 = {"One"};
        String[] arrayTest3 = null;

        printArray(createMinMaxArray(arrayTest1));
        printArray(createMinMaxArray(arrayTest2));
        printArray(createMinMaxArray(arrayTest3));
    }


    public static String[] createMinMaxArray(String[] array){

        if (array == null || array.length == 0) {
            return new String[0]; // Возвращаем пустой массив
        }

        String minStr = array[0];
        String maxStr = array[0];
        String[] newArray = new String[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minStr.length()) minStr = array[i];
            if (array[i].length() > maxStr.length()) maxStr = array[i];
        }

        newArray[0] = minStr;
        newArray[1] = maxStr;
        return newArray;
    }


    // для отладки программы
    public static void printArray(String[] strings) {

        if (strings == null || strings.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + (i == strings.length - 1 ? "]\n" : ", "));
        }
    }

}
