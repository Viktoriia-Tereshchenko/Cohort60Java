package consultations.cons_11.dogs;

import java.util.Arrays;
import java.util.Random;

public class DogApp {
    public static void main(String[] args) {

        Random rand = new Random();

        Dog[] dogs = new Dog[5];
        for (int i = 0; i < dogs.length; i++) {
            int jump = rand.nextInt(51) + 30;
            dogs[i] = new Dog("Dog_" + (i + 1), jump);
        }

        int[] barriers = new int[7];
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = rand.nextInt(101) + 70;
        }

        System.out.println("Барьеры: " + Arrays.toString(barriers));

        int[] result = new int[dogs.length];

        for (int i = 0; i < dogs.length; i++) {

            Dog currentDog = dogs[i];

            System.out.println(currentDog.toString() + "начинает!");

            int count = 0;
            for (int j = 0; j < barriers.length; j++) {

                int currentBarrier = barriers[j];

                if (currentDog.jumpBarrier(currentBarrier)) {
                    count++;
                }
            }
            result[i] = count;
            System.out.println("Собака: " + currentDog.getName() + "преодолела барьеров:" + count);
            System.out.println("\n============================\n");

        }

        System.out.println("Результаты: " + Arrays.toString(result));
        for (int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].toString());
            System.out.println(" -> Ее результат: " + result[i]);
        }
    }

}
