package homework_29.shapes;

public class Circle extends Shape {

    private double radius;
    public static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = PI * radius * radius;
        //System.out.printf("Площадь круга: %.2f\n", area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * PI * radius;
        //System.out.printf("Периметр круга (длина окружности): %.2f\n", perimeter);
        return perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
