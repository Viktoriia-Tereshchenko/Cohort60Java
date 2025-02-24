package homework_14;

public class Task04 {
    public static void main(String[] args) {
/*
Task 4
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
 */

        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        // 1. 8 + 3 = 11
        // 2. 11 > 10 -> true
        // 3. result = true
        System.out.println("Result 1: " + result); // Result 1: true

        result = (a - b) == 5;
        // 1. 8 - 3 = 5
        // 2. 5 == 5 -> true
        // 3. result = true
        System.out.println("Result 2: " + result); // Result 2: true

        result = (a * b) != 24;
        // 1. 8 * 3 = 24
        // 2. 24 != 24 -> false
        // 3. result = false
        System.out.println("Result 3: " + result); // Result 3: false

        result = (a / b) >= 2;
        // 1. 8 / 3 = 2
        // 2. 2 >= 2 -> true
        // 3. result = true
        System.out.println("Result 4: " + result); // Result 4: true

        result = !(a % b == 2);
        // 1. 8 % 3 = 2
        // 2. 2 == 2 -> true
        // 3. !true -> false
        // 4. result = false
        System.out.println("Result 5: " + result); // Result 5: false
    }
}
