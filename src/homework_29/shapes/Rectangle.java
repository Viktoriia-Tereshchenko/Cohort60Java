package homework_29.shapes;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = length * width;
        //System.out.printf("Площадь прямоугольника: %.2f\n", area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * (length + width);
        //System.out.printf("Периметр прямоугольника: %.2f\n", perimeter);
        return perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
