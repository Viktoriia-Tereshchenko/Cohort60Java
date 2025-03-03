package homework_25;

/*
Task 2
Неизменяемая переменная
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.
 */

public class Task02 {

    public static void main(String[] args) {

        final int MAX_USERS = 100;

        //MAX_USERS = 55;

        /* Ошибка: cannot assign a value to final variable MAX_USERS

        Переменная MAX_USERS имеет ключевое слово final, поэтому после первой инициализации
        (присвоение ей значения 100), ее значение не может быть изменено!

         */
    }
}
