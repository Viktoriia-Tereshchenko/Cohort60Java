package lesson_24;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("static totalCars: " + Car.totalCars);

        Car bwm = new Car("BMW", 200);
        System.out.println("static totalCars: " + Car.totalCars);
        System.out.println(bwm.toString());


        Car vw = new Car("VW", 300);
        System.out.println(vw.toString());
        System.out.println("После создания 2-х: " + bwm.toString());

        System.out.println("static totalCars: " + Car.totalCars);

        // Я могу обратится к статике от имени конкретного объекта
        // Но эта плохая практика. И так делать не рекомендуется
        // System.out.println("vw.totalCars: " + vw.totalCars);

        // Нам следует обращаться к статике от имени класса

        // Модификатор статик применим только к поля или методам класса
        //static int x;


    }
}
