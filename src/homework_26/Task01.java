package homework_26;

/*
Task 1
Иерархия классов “Фигуры”
Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.
При создании классов не забудьте о конструкторах

1. Базовый класс Shape
- Создайте класс Shape.
- Добавьте поле name типа String, которое хранит название фигуры.
- Создайте метод displayInfo(), который выводит на экран значение поля name.

2. Класс Rectangle (Прямоугольник)
- Создайте класс Rectangle, который наследуется от Shape.
- Добавьте поля width и height типа double, которые хранят размеры прямоугольника.
- Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height.
- Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.

3. Класс Circle (Круг)
- Cоздайте класс Circle, который наследуется от Shape.
- Добавьте поле radius типа double, которое хранит радиус круга.
- Создайте метод setRadius(double radius), который устанавливает значение поля radius.
- Создайте метод calculateArea(), который вычисляет и выводит площадь круга.

4. Класс Main
- В методе main создайте объекты классов Rectangle и Circle.
- Установите значения для их полей с помощью соответствующих методов.
- Установите имя фигуры, используя поле name, унаследованное от класса Shape.
- Вызовите метод displayInfo() и методы вычисления площади для каждого объекта, чтобы вывести информацию о фигуре и её площади.

Дополнительное задание (по желанию):
- Добавьте в класс Shape поле color типа String и метод setColor(String color).
- Установите цвет для каждой фигуры и выведите эту информацию в методе displayInfo().

Пример реализации (без кода):
Создаете базовый класс Shape с полем name и методом displayInfo().
Создаете класс Rectangle, который наследуется от Shape, с дополнительными полями и методами.
Аналогично создаете класс Circle.
В методе main работаете с объектами Rectangle и Circle, используя унаследованные и собственные методы этих классов.
 */
public class Task01 {
    public static void main(String[] args) {


        Rectangle rect = new Rectangle();
        rect.setDimensions(5, 3);

        Circle circle = new Circle();
        circle.setRadius(3.5);

        rect.name = "Прямоугольник ABCD";
        //rect.setName("ABCD");
        circle.name = "Круг, с радиусом ОА";

        rect.displayInfo();
        rect.calculateArea();

        circle.displayInfo();
        circle.calculateArea();

        rect.setColor("pink");
        rect.displayInfo();

        circle.setColor("white");
        circle.displayInfo();
    }
}
