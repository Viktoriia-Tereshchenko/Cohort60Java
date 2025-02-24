package homework_17;

public class Task05 {
    public static void main(String[] args) {

/*
Task 5 * (Опционально)
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.
Пример:
{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */
        String[] strings = {"Task", "number", "six"};
        printMaxString(strings);
    }

    public static void printMaxString(String[] strings) {

        int maxLength = strings[0].length();
        String maxString = strings[0];

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxLength) {
                maxLength = strings[i].length();
                maxString = strings[i];
            }
        }

        for (int j = 0; j < maxLength; j++) {
            System.out.println(maxString.charAt(j));
        }
    }

}
