package homework_28.shapes;

public class Square extends Shape {

    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.printf("Площадь квадрата %s: %.2f\n", getName(), area);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
