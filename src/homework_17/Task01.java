package homework_17;

public class Task01 {
    public static void main(String[] args) {

    /*
     Task 1
    Написать метод, принимающий на вход строку. Метод должен вывести на экран число,
    соответсвующее количеству символов в строке.
    Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
    */
        String string = "Проверка работы метода";
        printStringLength(string);
    }

    public static void printStringLength(String str) {
        System.out.println(str.length());
    }
}
