package hw.hw_29.shapes;

// Дз 29 версия учителя

/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

public class ShapesApp {
    public static void main(String[] args) {

        Circle circle = new Circle(-10);
        System.out.println(circle);

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new Triangle(5, 6, 18);

        double sumArea = 0;
        double sumPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {

            double area = shapes[i].area();
            double perimeter = shapes[i].perimeter();
            System.out.printf("%s площадь: %.2f; периметр: %.2f\n",
                    shapes[i].getClass().getSimpleName(), area, perimeter);

            sumArea += shapes[i].area();
            sumPerimeter += shapes[i].perimeter();
            System.out.println("\n=======================");
        }
        System.out.printf("Сумма площадей: %.2f\n", sumArea);
        System.out.printf("Сумма периметров: %.2f\n", sumPerimeter);


        System.out.println("\n=======================");

        // Невозможно моздать объект - нет публичных конструкторов
        //CircleSingleTone singleTone = new CircleSingleTone();

        // Не будет создан объект
        CircleSingleTone single = CircleSingleTone.getCircle(-5);
        System.out.println(single);

        CircleSingleTone circleSingle = CircleSingleTone.getCircle(5);
        System.out.println(circleSingle);
    }
}
