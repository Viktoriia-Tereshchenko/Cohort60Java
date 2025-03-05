package homework_27.bus;

public class Application {

    public static void main(String[] args) {

        BusDriver tom = new BusDriver("Tom", "LN-7788899101");
        BusDriver jeck = new BusDriver("Jeck", "LN-941054500");

        System.out.println(tom.toString());
        System.out.println(jeck.toString());

        Autobus bus1 = new Autobus(tom, 3);
        Autobus bus2 = new Autobus(jeck, 15);

        System.out.println(bus1.toString());
        System.out.println(bus2.toString());

        Passenger pass1 = new Passenger("Anna");
        Passenger pass2 = new Passenger("Olga");
        Passenger pass3 = new Passenger("Bob");

        System.out.println(pass1.toString());
        System.out.println(pass2.toString());
        System.out.println(pass3.toString());

        System.out.println("\n=============");
        bus1.takePassenger(pass1);
        bus1.takePassenger(pass2);
        bus1.takePassenger(pass3);

        System.out.println("Кол-во пассажиров: " + bus1.getCountPassengers());

        bus1.showListPassengers();

        bus1.dropPassenger(pass2);
        bus1.showListPassengers();

        bus1.dropPassenger(pass2);

        bus1.dropPassenger(pass2);
        bus1.showListPassengers();

        bus1.dropPassenger(pass3);
        bus1.showListPassengers();

        bus1.dropPassenger(pass1);
        bus1.dropPassenger(pass3);

        bus1.takePassenger(pass3);
        bus1.showListPassengers();




    }
}
