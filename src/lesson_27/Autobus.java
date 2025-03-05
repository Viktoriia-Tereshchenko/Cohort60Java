package lesson_27;

/*
Ассоциация - это связь, при которой один объект связан с другим объектом. Это наиболее общая форма связи.

Агрегация - это форма ассоциации, представляющая собой отношение "часть-целое",
где часть может существовать независимо от целого.
Чаще используем агрегацию!

Композиция - это более жесткая форма агрегации (также отношение часть-целое), НО где часть не может существовать без целого.
Обычно часть создается вместе с целым. Если целое уничтожается, часть также уничтожается. (жизненные циклы объектов).
Композиция используется намного реже!

Ассоциация (в том числе и Агрегация, и Композиция) реализуются через создание ссылок в классе на другие объекты.
Это значит, что класс содержит поля, которые ссылаются на объекты других классов.

Ассоциация - это отношение между двумя классами, где один класс использует другой класс в качестве одного из своих полей.

Важные аспекты ассоциации:
1) Направленность. Ассоциация может быть однонаправленная и двунаправленная.
   Двунаправленная классы знают друг о друге (ссылки друг на друга)

2) Кардинальность связи. Определяет сколько объектов одного класса может быть ассоциировано с обьектом другого класса
One-to-One (один к одному), One-to-Many(один ко многим), Many-to-Many (многие ко многим)

    1 : 1 -> Автобус и двигатель
    Каждый автобус может иметь ровно один двигатель, и на каждый двигатель приходится ровно один автобус.

    1 : Many -> Автобус и двигатель
    Один автобус может иметь множество пассажиров. Один пассажир - в одном автобусе

    Many : Many -> Список автобусов и список автобусных остановок
    Каждый автобус останавливается на множестве остановок
    На каждой остановке может обслуживаться множество автобусов

*/


/*
Автобус содержит Водителя. HAS-A. Агрегация. Водитель может существовать отдельно от автобуса.
- объект создается снаружи и приходит в параметре метода (конструктора / сеттера)


Автобус содержит Автопилот. HAS-A. Композиция. Автопилот является неотъемлемой часть автобуса.
Жесткая / неразрывная связь. Часть создается вместе с целым
- объект создается в конструкторе класса Автобус
 */


import java.util.Arrays;

public class Autobus {

    private static int counter = 1;

    // Уникальный идентификатор объекта
    private  final int id;


    // Поля с ссылками на объект другого класса

    private BusDriver driver; // агрегация (мягкая связь)
    private Autopilot autopilot; // композиция (жесткая связь)

    private final  int capacity;
    private int countPassengers;  // будет как "курсор" в массиве пассажиров

    private final Passenger[] passengers;

    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        driver.setAutobus(this);
        this.capacity = capacity;
        this.autopilot = new Autopilot("AP-v0001");
        this.passengers = new Passenger[capacity];
    }

    @Override
    public String toString() {
        return "Autobus {" +
                "id=" + id +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                ", capacity=" + capacity +
                '}';
    }

    public void showListPassengers() {

        //System.out.println(Arrays.toString(passengers));  // не подходит

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

    public  boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;
        /*
        1. Надо проверить свободное место
        2. Находиться ли уже этот пассажир в автобусе
        3. Если есть место и пассажир еще не в автобусе - садим на борт:
            3.1 Добавляем в список пассажиров
            3.2 Увеличиваем кол0во пассажиров
            3.3 Возвращаем true
        4. Иначе (3.3) - что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */
        if (countPassengers < capacity) {
            //место есть
            // надо проверить пункт 2
            if (isPassengerInBus(passenger)) {
                // метод вернул true, значит пассажир в автобусе
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }

            // садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобусе с id %d\n", passenger.getId(), this.id);
            return true;
        }

        // свободного места в автобусе нет
        System.out.printf("В автобусе с id %d свободных мест нет\n", this.id);
        return false;
    }


    // Находиться ли уже этот пассажир в автобусе
    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                // id совпали - значит это один и тот же объект
                return true;
            }
        }
        // пассажира с таки id нет в массиве пассажиров
        return  false;
    }


    public void setDriver(BusDriver driver) {
        this.driver.setAutobus(null);
        this.driver = driver;
        this.driver.setAutobus(this);
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
