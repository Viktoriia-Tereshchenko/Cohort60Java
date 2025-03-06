package homework_28.people;

public class SportPro extends SportAmateur{

    private final int speed = 25;
    private final int restTime = 5;

    @Override
    public void run() {
        System.out.printf("Я бегу со скоростью %d км/ч\n", speed);
        rest();
    }

    private void rest() {
        System.out.printf("Мне нужен отдых %d минут!\n", restTime);
    }
}
