package lesson_18;

public class MethodsWithReturn {
    public static void main(String[] args) {

        // Возвращаемое значение - результат, который метод отправляет обратно вызывающему его (метод) коду
        // как результат своей работы.
        // Это способ передать результат вычислений метода в другие части программы

        // int sum = 10 + 5;
        calculateSum(10,5);
        int sum = calculateSum(10, 5); // -> int sum = 15;

        sum = calculateSum(10,5) + calculateSum(20,30); // sum = 15 + 50 -> sum = 65;
        System.out.println("sum: " + sum);

        System.out.println("\n===================\n");

        double pow = powTwo(3);
        System.out.println("powTwo(3): " + pow);

        System.out.println("powTwo(0): " +powTwo(0));
        System.out.println("powTwo(-3): " +powTwo(-3));

//        test(5);
//        test(-10);
//        test(3);



    } //Method area

/*
    //  Сигнатура метода - совокупность названия методов и набора его параметров

    public static int test(int x) {
        return -1;
    }
    public static double test(double x) {
        return -10;
    }
*/

    // Написать метод возвращающий 2 в степени Х. Х метод получает в качестве параметра.

    public static void test(int x) {
        // НЕ печатать числа, если x = 3;
        if (x == 3){
            // Как-то прервать работу метода !?
            return; // прекращает работу метода
            // в void методах ДОЛЖЕН использоваться без возвращаемого значения
        }

        // печать числа от 0 до x
        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }


    public static double powTwo(int x) {
        //2 ^ x
        // 2 ^ 3 = 2 * 2 * 2 = 8
        boolean isPositive = x >= 0;

        // что если х отрицательный - отбросить знак числа
        if (x < 0) x *= (-1);

        // вычисляем 2 ^ |x|

        int result = 1;
        for (int i = 1; i <= x ; i++) {   // или  (int i = 0; i < x ; i++)
            result = result * 2;
        }

        if (isPositive) {
            return result;
        }
        else {
            return (double) 1 / result;
        }
    }


    public static int calculateSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result; // return - оператор, заканчивающий работу метода и возвращающий значение
    }

}
