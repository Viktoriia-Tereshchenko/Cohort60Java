package homework_12;

public class Task06 {
    public static void main(String[] args) {

        long bigNumber = 15000000000L;
        int smallNumber;

        smallNumber = (int) bigNumber;
        System.out.println("Значение smallNumber: " + smallNumber);

        // Диапазон int от -2 147 483 648 до 2 147 483 647
        // Значение smallNumber: 2 115 098 112
        // Получено после многократного (6 раз) уменьшения числа 15 000 000 000 на величину -2 147 483 648
    }
}
