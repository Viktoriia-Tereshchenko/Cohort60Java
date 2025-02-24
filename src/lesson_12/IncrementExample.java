package lesson_12;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;
        x = x + 10;

        x += 5; // x = x + 5
        System.out.println("x: " + x);

        x -= 2; // x = x - 2
        x *= 2; // x = x * 2
        x /= 5; // x = x / 5
        System.out.println("15 строка -> x = " + x);

        // Инкремент, декремент
        x++; // x = x + 1; x += 1; // Инкремент - увеличить текущее значение в переменной х на 1
        System.out.println("x: " + x);

        x--; // x = x - 1; x -= 1; // Декремент - уменьшить текущее значение в переменной х на 1
        System.out.println("x: " + x);

        System.out.println("\n============================\n");

        /*
         Инкремент и декремент можно записать по - разному:
         после переменно х++, х-- (постфикс)
         перед переменной ++х, --х (префикс)

         Если запись постфикс (х++), то сначала используется текущее значение переменно, а потом оно будет увеличено
         */

        int var = 100;
        System.out.println("var: " + var++);  // var = 100
        System.out.println("var: " + var);  // var = 101

        int y =100;
        System.out.println("y: " + ++y);   // y = 101
        System.out.println("y: " + y);   // y = 101

        System.out.println("var: " + var++ +var);  // var = 101102

    }
}
