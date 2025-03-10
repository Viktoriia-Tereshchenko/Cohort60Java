package hw_29.shapes;


import java.awt.*;

public class CircleSingleTone extends Shape {


    // Классическая реализация SingleTone !!!
    // Может существовать только 1 объект класса!!!

    private static CircleSingleTone instance; // закрытое приватное поле, содержащее объект
    private double radius;

    // Приватный конструктор !!! Публичного конструктора нет и Java его не будет авт-ки генерировать
    private CircleSingleTone(double radius) {
        this.radius = radius;
    }

    public static CircleSingleTone getCircle(double radius) {
        if (radius < 0 ) return null;
        return new CircleSingleTone(radius);
    }

/*
    --------------------------------------------------------------------
    // Классический SingleTone
    public static CircleSingleTone getInstance(double radius) {
        if (instance == null) {
            instance = new CircleSingleTone(radius);
        }
        return instance;
    }
    ---------------------------------------------------------------------
*/


//    public CircleSingleTone(double radius) {
//        if (radius < 0) return;
//        this.radius = radius;
//    }


    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
