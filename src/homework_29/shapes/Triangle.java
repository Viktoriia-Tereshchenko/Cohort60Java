package homework_29.shapes;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        if (existenceTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Такого треугольника не существует!");
        }
    }

    private boolean existenceTriangle(double side1, double side2, double side3) {
        if ((side1 < side2 + side3) &&
            (side2 < side1 + side3) &&
            (side3 < side1 + side2)) {
            return true;
        }
        return false;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        //System.out.printf("Площадь треугольника: %.2f\n", area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        //System.out.printf("Периметр треугольника: %.2f\n", perimeter);
        return perimeter;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
