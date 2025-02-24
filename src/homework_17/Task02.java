package homework_17;

public class Task02 {
    public static void main(String[] args) {

/*
Task 2
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до этого индекса
распечатывается в обычном порядке, а начиная с этого индекса в обратном:
{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
 */

        int[] numbers = {14, 2, 5, 1, 9, 7, 3};
        printArray(numbers);

        int index = 3;
        System.out.println("Индекс: " + index);
        printArray(numbers, index);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i > 0 ? ", " : "]\n"));
        }
    }

    public static void printArray(int[] array, int index) {

        if (index >= 0 & index <= array.length - 1) {

            String arrayStr = "[";
            for (int i = 0; i < index; i++) {
                arrayStr += array[i] + (i != index ? ", " : "]");
            }
            for (int i = array.length - 1; i >= index; i--) {
                arrayStr += array[i] + (i != index ? ", " : "]");
            }
            System.out.println(arrayStr);

        } else {
            System.out.println("Неправильный индекс!");
        }
    }

}


