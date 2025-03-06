package homework_28.shapes;

public class Triangle extends Shape {

    private double side;
    private double height;

    public Triangle(String name, double side, double height) {
        super(name);
        this.side = side;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = (side * height) / 2;
        System.out.printf("Площадь треугольника %s: %.2f\n", getName(), area);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
