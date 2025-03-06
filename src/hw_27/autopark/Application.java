package hw_27.autopark;

public class Application {

    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("Tom", "LN-11");
        Autobus autobus = new Autobus(busDriver, 4);

        Passenger pas1 = new Passenger("John");
        Passenger pas2 = new Passenger("Max");
        Passenger pas3 = new Passenger("Hanna");
        Passenger pas4 = new Passenger("Luisa");
        Passenger pas5 = new Passenger("Passenger");

        System.out.println(autobus.toString());

        autobus.takePassenger(pas1);
        autobus.takePassenger(pas2);
        autobus.takePassenger(pas5);
        autobus.takePassenger(pas3);
        autobus.takePassenger(pas4);

        autobus.showListPassengers();

        System.out.println("\n===================");
        System.out.println(autobus.dropPassenger(pas4));
        System.out.println(autobus.dropPassenger(pas5));

        autobus.showListPassengers();

        autobus.takePassenger(pas1);
        autobus.takePassenger(pas4);

        autobus.showListPassengers();
        //System.out.println(autobus.getCountPassengers());

        System.out.println(autobus.toString());
    }
}
