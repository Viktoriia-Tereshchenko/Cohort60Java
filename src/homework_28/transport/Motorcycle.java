package homework_28.transport;

public class Motorcycle extends Vehicle {

    private String engine;

    public Motorcycle(String engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.println("Запущен двигатель: " + engine);
    }
}
