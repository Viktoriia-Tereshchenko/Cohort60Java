package homework_28.shapes;

/*
Task 2
Создайте иерархию классов для разных типов транспортных средств:
Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).

Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.

Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска
соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова
метода startEngine() для каждого транспортного средства.
 */


public class Task02 {
    public static void main(String[] args) {

        Circle circle = new Circle("Круг1", 2);
        //circle.calculateArea();

        Square square =new Square("ABCD", 2.7);
        //square.calculateArea();

        Triangle triangle = new Triangle("EDF", 4.2, 3);
        //triangle.calculateArea();

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calculateArea();
        }
    }
}
