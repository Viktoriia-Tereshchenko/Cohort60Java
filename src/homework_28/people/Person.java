package homework_28.people;

public class Person {

    private final int speed = 10;
    private final int restTime = 15;

    public Person() {
    }

    public void run() {
        System.out.printf("Я бегу со скоростью %d км/ч\n", speed);
        rest();
    }

    private void rest() {
        System.out.printf("Мне нужен отдых %d минут!\n", restTime);
    }

    public int getSpeed() {
        return speed;
    }

    public int getRestTime() {
        return restTime;
    }
}