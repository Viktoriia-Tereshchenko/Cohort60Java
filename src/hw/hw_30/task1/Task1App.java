package hw.hw_30.task1;

// Д/з реализация учителя

/*
Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class Task1App {
    public static void main(String[] args) {

        Triathlete triathlete = new Triathlete("Sebastian");
        triathlete.run();
        triathlete.swim();
    }
}
