package homework_26;

public class Circle extends Shape{

    private double radius;
    public static final double PI = 3.14159;

    public Circle() {
        super();
      }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Площадь круга: " + (PI * radius * radius));
    }



}
