package homework_17;

public class Task03 {
    public static void main(String[] args) {

/*
Task 3
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя ;)

P.S. А почему вы решили, что число может прийти только положительное? ;)
 */

        int power = 5;
        takingTwoToPower(power);
        takingTwoToPower(-7);

        //System.out.printf("Число 2 в степени %d : %d\n", power, takingTwoToPower(power));

    }

    public static void takingTwoToPower(int power) {

        int result = 1;
        boolean negative = false;  // отрицательная ли степень ?

        if (power < 0) {
            negative = true;
            power *= -1;
        }

        for (int i = 1; i <= power; i++) {
            result *= 2;
        }

        if (!negative) System.out.println(result);
        else System.out.println((double) 1 / result);

//        if (!negative) System.out.printf("Число 2 в степени %d : %d\n", power, result);
//        else System.out.printf("Число 2 в степени %d : %f\n", power * (-1), (double) 1 / result);
    }
}
// ПЕРЕДЕЛАТЬ без лишних слов!!!!!!! Результат - только число !!!!!!!!