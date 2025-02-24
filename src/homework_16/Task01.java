package homework_16;

public class Task01 {
    public static void main(String[] args) {
/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.
Результат выведите на экран
 */
        long product = 1;
        int i = 1;

        while (i <= 15) {
            product *= i;
            i++;
        }

        System.out.println("Произведение всех чисел от 1 до 15: " + product);
    }
}
