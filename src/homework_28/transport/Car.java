package homework_28.transport;

public class Car extends Vehicle {

    private String engine;

    public Car(String engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.println("Запущен двигатель: " + engine);
    }
}
