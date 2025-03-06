package homework_28.people;

public class SportAmateur extends Person{

    private final int speed = 15;
    private final int restTime = 10;

    @Override
    public void run() {
        System.out.printf("Я бегу со скоростью %d км/ч\n", speed);
        rest();
    }

    private void rest() {
        System.out.printf("Мне нужен отдых %d минут!\n", restTime);
    }
}
