package homework_27.bus;

public class Autobus {

    private static int counter = 1; // счетчик для id
    private final int id;

    // Поля с ссылками на объект другого класса
    private BusDriver driver;
    private Autopilot autopilot;

    private final int capacity;
    private int countPassengers;  // будет как "курсор" в массиве пассажиров

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    //Task 3 * (Опционально)
    //Переписать метод public String toString()в классе Autobus, используя StringBuilder для формирования строки.
    public String toString() {

        StringBuilder sb = new StringBuilder("Autobus {");

        sb.append("id=").append(id).append(", ");
        sb.append(driver.toString()).append(", ").append(autopilot.toString());
        sb.append(", capacity=").append(capacity).append('}');

        return sb.toString();
    }

    public void showListPassengers() {

        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    // посадка пассажира в автобус
    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

        // есть места
        if (countPassengers < capacity) {

            // пассажир уже в автобусе?
            if (isPassengerInBus(passenger) != -1) {
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }

            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобусе с id %d\n", passenger.getId(), this.id);
            return true;
        }
        // мест нет
        System.out.printf("В автобусе с id %d свободных мест нет\n", this.id);
        return false;
    }

    // Находиться ли уже этот пассажир в автобусе
    // Переделано -> возвращает индекс в массиве пассажиров или -1, если пассажира нет в автобусе
    private int isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return i;
            }
        }
        return -1;
    }

    //Task 4 * (Опционально)
    //Реализовать в классе Autobus метод высадки пассажира из автобуса boolean dropPassenger(Passenger passenger)
    public boolean dropPassenger(Passenger passenger) {

        if (passenger == null) return false;

        if (isPassengerInBus(passenger) == -1) {
            System.out.printf("Пассажира с id %d нет в автобусе с id %d\n", passenger.getId(), this.id);
            return false;
        }

        // высадка пассажира
        int index = isPassengerInBus(passenger);

        for (int i = index; i < countPassengers - 1; i++) {
            passengers[i] = passengers[i + 1];
        }
        //passengers[countPassengers - 1] = null; // не нужно т.к.значения перезапишутся
        countPassengers--;
        System.out.printf("Пассажир с id %d вышел из автобуса с id %d\n", passenger.getId(), this.id);
        return true;
    }


    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }
}
