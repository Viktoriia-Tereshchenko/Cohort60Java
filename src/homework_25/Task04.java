package homework_25;

/*
Task4 * (Опционально)
Final параметр метода
•	Напишите метод printMessage(final String message), который выводит сообщение на экран.
        •	Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
*/

public class Task04 {
    public static void main(String[] args) {

        FinalMessage.printMessage("Hello!");
        FinalMessage.printMessage("Java");
        FinalMessage.printMessage(null);
    }


}
