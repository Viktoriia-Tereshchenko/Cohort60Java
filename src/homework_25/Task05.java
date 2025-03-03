package homework_25;

/*
Task 5 *(Опционально)
- Создать 5 объектов класса Dog (из предыдущего ДЗ) со случайным прыжком от 30 до 80
- Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
- Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
- Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
 */


import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {

        Random random = new Random();

        Dog[] dogs = new Dog[5];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog("dog" + i, random.nextInt(51) + 30);
        }

        int[] barriers = new int[7];
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = random.nextInt(101) + 70;
        }

        System.out.println("Барьеры: " + Arrays.toString(barriers));

        int count = 0;
        String result;

        for (int i = 0; i < dogs.length; i++) {

            result = String.format("Name: %s, jumpHeight: %d (max %d), ", dogs[i].getName(), dogs[i].getJumpHeight(), dogs[i].getMaxJump());

            for (int j = 0; j < barriers.length; j++) {
                if (dogs[i].jumpBarrier(barriers[j])) {
                    count++;
                }
            }
            result += "barriers: " + count;
            System.out.println(result);
            count = 0;
        }

    }
}
