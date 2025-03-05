package homework_26.shapes;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        System.out.println("Площадь прямоугольника: " + (this.width * this.height));
    }



}
