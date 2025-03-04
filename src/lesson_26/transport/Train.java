package lesson_26.transport;


// Train is-a Bus -> false. НЕ ВЕРНО - наследоваться не имею права
// Train is-a Vehicle ->true

public class Train extends Vehicle{

    private int capacity;
    private int countPassengers;

    private int countWagons;
    private  final int wagonCapacity;

    public Train(String model, int year, int countWagons, int wagonCapacity) {
        super(model, year); // автоматически первой строкой
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;

        // Определить вместимость - рассчитать capacity
        calculateCapacity();
    }

    // выносим в метод, чтобы не дублировать код и вдруг измениться логика!
    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();

        // Проконтролировать, что кол-во пассажиров не превышает новую вместимость
        // TODO
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

}
