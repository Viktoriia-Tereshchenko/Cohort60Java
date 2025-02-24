package homework_16;

public class Task06 {
    public static void main(String[] args) {

/*
Task 6
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
Пример:
{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }

 */
        int[] numbers = new int[]{-11, 3, 28, 0, 81, 17};

        String arrayStr;  // для вывода на экран
        int min = numbers[0];
        int max = numbers[0];
        int indexMin = 0;
        int indexMax = 0;
        int i = 0;

        arrayStr = "{ ";

        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
                indexMin = i;
            }

            if (numbers[i] > max) {
                max = numbers[i];
                indexMax = i;
            }

            arrayStr += numbers[i] + ((i != numbers.length - 1) ? ", " : " }");
            i++;
        }

        arrayStr += " -> { ";

        // перестановка элементов
        numbers[indexMin] = max;
        numbers[indexMax] = min;

        // проход по измененному массиву для вывода на экран
        i = 0;
        while (i < numbers.length) {
            arrayStr += numbers[i] + ((i != numbers.length - 1) ? ", " : " }");
            i++;
        }

        System.out.println(arrayStr);

    }
}
