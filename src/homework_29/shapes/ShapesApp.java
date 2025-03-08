package homework_29.shapes;

/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

public class ShapesApp {
    public static void main(String[] args) {

        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(5,4.2);
        Triangle triangle = new Triangle(5, 4, 7);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println("\n===============");

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println("\n===============");

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        System.out.println("\n====================");

        Triangle triangle2 = new Triangle(1, 3, 7); // такого треугольника не существует
        System.out.println(triangle2.getSide1()); // объект создался, но со сторонами 0

        System.out.println("\n====================");
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].calculateArea();
            totalPerimeter += shapes[i].calculatePerimeter();
        }
        System.out.printf("Общая площадь: %.2f, общий периметр: %.2f\n", totalArea, totalPerimeter);

    }
}
