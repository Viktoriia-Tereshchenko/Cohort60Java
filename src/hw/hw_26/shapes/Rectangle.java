package hw.hw_26.shapes;

// ДЗ 26 версия учителя

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    public Rectangle(String name, String color, double height, double width) {
        super(name, color);
        this.height = height;
        this.width = width;
    }

    public void setDimensions(double width, double height) {

        // возможны проверки!
        this.width = width;
        this.height = height;
    }

    public double  calculateArea() {
        double area = width * height;
        System.out.println("Area: " + area);
        return area;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
