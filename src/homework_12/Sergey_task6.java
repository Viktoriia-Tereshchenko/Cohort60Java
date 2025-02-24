package homework_12;

public class Sergey_task6 {

    public static void main(String[] args) {

        /*
Task 6 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:
Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.
         */
        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("smallNumber: " + smallNumber);
        System.out.println("long: " + Long.toBinaryString(bigNumber));
        System.out.println("int1:    " + Integer.toBinaryString(smallNumber));
        System.out.println("int2:   " + Integer.toBinaryString(smallNumber * (-1)));

        System.out.println(Math.pow(2, 32) + Math.pow(2, 33));
        System.out.println(Math.pow(2, 32));

    }
}
