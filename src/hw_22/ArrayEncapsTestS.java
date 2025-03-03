package hw_22;

import java.util.Arrays;

// Версия ДЗ 22 Сергея (учителя)

public class ArrayEncapsTestS {
    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};
        MagicArrayEncapsS magic = new MagicArrayEncapsS(test);
        magic.test();
        magic.add(10);
        System.out.println(magic.toString());
        magic.test();
        test[3] = 1000;
        magic.test();

        magic.add(20, 330, 40);

        System.out.println(magic.toString());
        int[] fromMagic = magic.toArray();
        System.out.println("массив: " + Arrays.toString(fromMagic));

        System.out.println("\n========================remove");
        System.out.println(magic.removeByValue(330));
        System.out.println(magic.removeByValue(10000));
        System.out.println(magic.removeByValue(-2_147_483_647));
        System.out.println(magic.toString());
    }
}
