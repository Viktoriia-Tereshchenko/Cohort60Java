package homework_25;

/*
Task4 * (Опционально)
Final параметр метода
•	Напишите метод printMessage(final String message), который выводит сообщение на экран.
        •	Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
*/

public class FinalMessage {

    public static void printMessage(final String message) {
        System.out.println(message);

       // message = "New text";

        /*
        Ошибка: final parameter message may not be assigned

        Параметр метода message объявлен как final, и значит не может быть изменен после инициализации.
        Когда мы передаем параметр message в метод printMessage, он становится неизменяемым, и то что пользователь
        указал при вызове становиться его первым и постоянным в рамках работы метода значением.

        Если мы в методе main вызовем метод
                FinalMessage.printMessage("Java");
        то в первой строке кода
                public static void printMessage(final String message) {
        1. Создастся переменная final String message
        2. В нее запишется значение "Java" -> message = "Java"
        3. Начнет выполняться код в теле метода printMessage, где значение message уже не доступно для изменения
        4. Попытка присвоить новое значение переменной message вызывает ошибку компиляции.
         */
    }
}
