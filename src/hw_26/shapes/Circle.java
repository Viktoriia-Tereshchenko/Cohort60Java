package hw_26.shapes;

public class Circle extends  Shape{

    private double radius;
    public static final double PI = 3.14159;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
        return area;
    }

}
