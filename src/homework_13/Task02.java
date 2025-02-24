package homework_13;

public class Task02 {

    public static void main(String[] args) {

    /*
    Task 2
    Создайте строки:
        "Java"
        "is"
        "a"
        "powerful"
        "language"
    Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
    Выведите на экран получившуюся строку и её длину.

    Task 2.2
    Замените в результирующей строке слово "powerful" на "super".
    Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
    Выведите на экран значение этой переменной.
    */

        //Task 2

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        // String result = str1.concat(str2).concat(str3).concat(str4).concat(str5);
        // Результат: Javaisapowerfullanguage    - не подходит

        String result1 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        String result2 = String.join(" ", str1, str2, str3, str4, str5);

        System.out.println("Конкатенация 1 (+): " + result1);
        System.out.println("Длина строки 1: " + result1.length());
        System.out.println("Конкатенация 2 (join): " + result2);
        System.out.println("Длина строки 2: " + result2.length());

        // Task 2.2
        String replStr = result1.replace("powerful" , "super");
        System.out.println("==================================================");
        System.out.println("Замена слова: " + replStr);

        boolean findAge = replStr.contains("age");
        System.out.println("Содержит ли строка подстроку \"age\"? Ответ: " + findAge);
    }
}
