package lesson_26.transport;

// extends - наследование. Bus наследуется от Vehicle
// Smartphone is a Vehicle -> НЕ верно. Применять наследование НЕЛЬЗЯ.
// Bus is a Vehicle -> верно. Можно применит наследование.

// Мы получаем все - поля и методы от класса родителя, КРОМЕ конструктора !

public class Bus extends Vehicle {

    private int capacity; // max пассажиров
    private int countPassengers; // тек. кол-во пассажиров

    // Так выглядит конструктор по-умолчанию для класса-потомка
    /*
    public Bus() {
        // Ключевое слово super - это обращение к родительскому классу
        // super() - вызов конструктора родительского класса
        super();
    }
    */

    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя
        // Если в конструкторе потомка нет явного вызова конструктора-родителя
        // то автоматически будет создан пустой конструктор родителя super();

        // Вызов конструктора родителя должен быть ПЕРВОЙ строчкой исполняемого кода!
        super(model, year); // возов родит-го конструктора, принимающего модель и год

        this.capacity =capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassenger() {
        // Проверить, есть ои свободное место?
        // Если есть - посадить - увеличить кол-во пассажиров
        if (countPassengers < capacity) {
            countPassengers++;
            // имею доступ в насладнике к полю родителя с модификатором ptotected
            System.out.println("Пассажир зашел в автобус: " + model);
            // если переменная  model будет private, то доступ через геттер
            //System.out.println("Пассажир зашел в автобус: " + this.getModel());
            return true;
        }
        // По сути и есть блок else. В строку попаду, если if выдаст false
        System.out.printf("В автобусе %s мест нет. Сейчас %d пассажиров\n", model, countPassengers);
        return false;
    }

    // метод высадки пассажира из автобуса
    public boolean dropPassenger() {
        // Главная задача не уйти в минус
        // TODO реализовать метод
        return false;
    }


}
