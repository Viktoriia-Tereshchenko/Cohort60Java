package hw.hw_26.shapes;


public class ShapeApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rect1", 4.0, 3.0);
        rectangle.setDimensions(5.0, 6.0);
        rectangle.setColor("Red");  // унаследованный от Shape метод
        rectangle.displayInfo(); // унаследованный метод
        rectangle.calculateArea(); // метод класса Rectangle

        System.out.println("\n=================");

        Circle circle = new Circle("Circle1", "yellow", 5.0);
        circle.displayInfo();
        circle.setRadius(10);
        circle.calculateArea();
    }
}
