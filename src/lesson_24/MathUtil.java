package lesson_24;


// Утилитные классы имеют только статические методы
// для вызова не нужно создавать экземпляр класса

public class MathUtil {

    public static int sumIntegers(int... integers) {
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
        }
        return sum;
    }
}
