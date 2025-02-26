package homework_22;

public class TestHW22 {
    public static void main(String[] args) {

        System.out.println("\n=======ПРОВЕРКА Д/З========\n");

        MagicArray testArray = new MagicArray();
        testArray.add(1, 100, 5, 100, 24, 0, 100, 7);
        System.out.print("Массив в памяти: ");
        testArray.test();
        System.out.println("Заполненный массив: " + testArray.toString());
        System.out.println("Размер массива: " + testArray.size());
        System.out.println("testArray.get(2): " + testArray.get(2));
        System.out.println("testArray.indexOf(100): " + testArray.indexOf(100));


        System.out.println("\n=======lastIndexOf========\n");

        System.out.println("testArray.lastIndexOf(1): " + testArray.lastIndexOf(1));
        System.out.println("testArray.lastIndexOf(5): " + testArray.lastIndexOf(5));
        System.out.println("testArray.lastIndexOf(100): " + testArray.lastIndexOf(100));
        System.out.println("testArray.lastIndexOf(9): " + testArray.lastIndexOf(9));

        System.out.println("\n=======removeByValue========\n");

        System.out.println("Массив: " + testArray.toString());
        System.out.println("Удаление элемента = 9: " + testArray.removeByValue(9));
        System.out.println(testArray.toString());
        System.out.println("Удаление элемента = 1: " + testArray.removeByValue(1));
        System.out.println(testArray.toString());
        System.out.println("Удаление элемента = 100: " + testArray.removeByValue(100));
        System.out.println(testArray.toString());
        System.out.println("Удаление элемента = 7: " + testArray.removeByValue(7));
        System.out.println(testArray.toString());
        System.out.println("Удаление элемента = 24: " + testArray.removeByValue(24));
        System.out.println(testArray.toString());

        System.out.println("\n=======MagicArray(int[] array)========\n");
        int[] numbers1 = new int[]{1, 2, 3, 11};
        int[] numbers2 = null;
        int[] numbers3 = new int[]{};
        MagicArray testArray2 = new MagicArray(numbers1);
        System.out.println(testArray2.toString());
        testArray2 = new MagicArray(numbers2);
        System.out.println(testArray2.toString());
        testArray2 = new MagicArray(numbers3);
        System.out.println(testArray2.toString());


    }
}
