package homework_14;

public class Task01 {
    public static void main(String[] args) {

/*
Task 1
Дан текст Programming is fun.
Напишите программу, которая проверяет, содержит ли эта строка слово “fun”,
и выведите результат в виде булевой переменной.
*/

        String text = "Programming is fun";
        boolean contains = text.contains("fun");
        System.out.println("Cодержит ли эта строка слово “fun”: " + contains);
    }
}
