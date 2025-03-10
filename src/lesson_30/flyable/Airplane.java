package lesson_30.flyable;

// Сначала extends, потом implements
public class Airplane extends Transport implements Flyable{

    // Если хотя бы одни метод интерфейса не имплементирован, то класс должен быть абстрактным !!!


    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    boolean takePassenger() {
        if (amountPassengers < capacity) {
            amountPassengers++;
            return true;
        }
        return  false;
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }

    // Например, если у интерфейсов одинаковые методы test(), то мы реализуем его только один раз!!!!
    void test() {
        System.out.println("TEST");
    }



}
