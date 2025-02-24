package lesson_15;

import java.util.Random;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        /*
        Switch - используется, когда нужно выполнить разные действия в зависимости от значения одной переменной или выражения.
        Это альтернатива множественным операторам if-else if, когда проверяется равенство одной переменной с разными значениями.

        Особенно хорошо, когда мы выбираем из известного и конечного количества вариантов
         */

        int x = 5;

        if (x == 5) {
            System.out.println("if: x равен 5");
        } else if (x == 7) {
            System.out.println("if-else: x равен 7");
        } else {
            System.out.println("else: что-то другое");
        }

        /*

        switch (выражение) {
           case значение1:
                // Блок кода для значения 1
           case значение2:
                // Блок кода для значения 2
           ...
           default:
                // Блок кода по умолчанию (если ни одно из значений не совпало)

        }

         */

        System.out.println("============================");

        switch (x) {
            case 5:
                System.out.println("switch: x равен 5");
                break;
            case 7:
                System.out.println("switch: x равен 7");
                break;
            case 11:
                System.out.println("switch: x равен 11");
                break;
            default:
                System.out.println("switch: что-то другое");
        }

        System.out.println("Строка за пределами switch");

        // Просим пользователя ввести число от 1 до 4. В зависимости от числа - выдать разное сообщение.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
            case 4: // if (x == 3 || x==4 )
                System.out.println("Вы ввели три или четыре");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }



        /*

        // Java 14 or higher
        switch (input) {
            case 1 -> System.out.println("Opt2: Вы ввели один");
            case 2 -> System.out.println("Opt2: Вы ввели два");
            case 3,4  -> System.out.println("Opt2: Вы ввели три или четыре");
            default -> System.out.println("Opt2: Я таких чисел не знаю");
        }

        String result = switch (input) {
            case 1 -> "Opt2: Вы ввели один";
            case 2 -> "Opt2: Вы ввели два";
            case 3,4 -> "Opt2: Вы ввели три или четыре";
            default -> "Opt2: Я таких чисел не знаю";
        }

        */


        /*
          У ребенка есть карманные деньги. ДОпустим сейчас у него 100
         Ребенок получает оценку в школе (от 1 до 5)
         за хорошие оценки получает деньги, за плохие отбирают
         5 -> +20
         4 -> +10
         3 -> +0
         2 -> -20
         1 -> заберут все деньги
         */

        System.out.println("\n=================\n");

        Random random = new Random();
        int note;  // Генерация случайного числа от 1 до 5 включительно
        note = random.nextInt(5) + 1;

        int money = 100;

        System.out.println("Ребенок получил оценку: " + note);

        // Java code v. before 12
        switch (note) {
            case 5:
                money += 20; // money = money + 20;
                break;
            case 4:
                money += 10;
                break;
            case 2:
                money -= 20;
                break;
            case 1:
                money = 0;
                // default не нужен
        }

        System.out.println("У ребенка сейчас денег " + money);

    /*
        // Для версии Java от 14 и выше
        // Восстанавливаю значение
        money = 100;
        money = switch (note) {
            case 5 -> money + 20;
            case 4 -> money + 10;
            case 2 -> money - 20;
            case 1 -> 0;
            default -> money;

        System.out.println("switch2: осталось денег " + money);
    */

     /*
        // Для версии Java от 17 и выше
        // Мультистроки

        String multiString = """
            Мультистрока 1
            Строка 2
            строка 3
            """;
    */
        System.out.println("\n====================\n");
        System.out.println("У меня есть загадка");
        System.out.println("Что это: желтый, большой, с рогами и полный зайцев?");
        System.out.println("Как думаешь?");

        String answer = scanner.nextLine();

        // троллейбус, Тролейбус,  Троллейбус  ,  Троллейбус! ->

        // trim() - возвращает строку без пробелов в начале и конце
        // "a    ffff" -> "a    ffff"
        // "       ffffd  dfdfdf   " -> "ffffd  dfdfdf"

        String answerClean = answer.trim().toLowerCase();

        System.out.println("trim: " + answerClean);

        switch (answerClean) {
            case "троллейбус":
            case "троллейбус!":
                System.out.println("Молодец,угадал!");
                break;
            case "сдаюсь":
            case "сдаюсь!":
                System.out.println("Быстро ты сдался. Правильный ответ троллейбус");
                break;
            default:
                System.out.println("Ответ не верный! Попробуй еще раз");
        }


    }
}
