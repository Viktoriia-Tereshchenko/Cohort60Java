package homework_28.shapes;

public class Circle extends Shape{

    private double radius;
    public static final double PI = 3.14159;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.printf("Площадь круга: %.2f\n", area);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
