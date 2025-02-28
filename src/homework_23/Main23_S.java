package homework_23;

// Версия ДЗ 23 Сергея (учителя)

public class Main23_S {
    public static void main(String[] args) {

        MagicArrayHW23_S magicArray = new MagicArrayHW23_S();
        magicArray.add(1, 2, 3, 4, 5);
        System.out.println(magicArray.toString());

        //magicArray.cursor = -5;
        magicArray.add(1000);


        //magicArray.array = null;
        magicArray.test();

        System.out.println(magicArray.toString());

    }
}
