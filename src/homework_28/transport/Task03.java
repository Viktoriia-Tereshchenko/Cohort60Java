package homework_28.transport;

/*
Task 3 опционально
Фигуры и их площади
Создайте класс Фигура с методом рассчитатьПлощадь().
Реализуйте классы различных геометрических фигур (например, Круг, Квадрат, Треугольник).
В главном классе создайте список фигур и вычислите площадь каждой из них.

 */
public class Task03 {
    public static void main(String[] args) {

        Car car = new Car("K4MC813");
        car.startEngine();

        System.out.println("\n =================");

        Bicycle bicycle = new Bicycle();
        bicycle.startEngine();

        System.out.println("\n =================");

        Motorcycle motorcycle = new Motorcycle("BMW-F800G");
        motorcycle.startEngine();

    }
}
