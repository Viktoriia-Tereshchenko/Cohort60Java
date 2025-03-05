package homework_27.components;

/*
Task 2
Компьютер и компоненты
Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.
*/

public class Task02 {
    public static void main(String[] args) {

        Storage storage = new Storage("Toshiba", "X300", "HDD", 500);

        Computer computer = new Computer(storage);
        System.out.println(computer.toString());

    }

}
