package homework_12;

public class Task01 {
    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 1;
        int number3 = 2;
        int number4 = 3;

        int averageNumber = (number1 + number2 + number3 + number4) / 4;
        System.out.println("Среднее арифметическое чисел: " + averageNumber);

        System.out.println("Отброшено в остаток: " + (number1 + number2 + number3 + number4) % 4);
    }
}
