package homework_35;

public class RectangleTest {
    public static void main(String[] args) {

        // Task1
        System.out.println("\n================TASK 1================");
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(5.2, 3.1);
        Rectangle rec3 = new Rectangle(7.0, 4.0);

        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec3);

        System.out.println();
        Rectangle rec4 = new Rectangle(-1, -2);
        System.out.println(rec4);

        // Task2
        System.out.println("\n================TASK 2=================");
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(4.0, 2.0);

        System.out.println(rect1.equals(rect2)); // Должно быть true
        System.out.println(rect1.equals(rect3)); // Должно быть false

        System.out.println();
        Rectangle rect4 = new Rectangle();
        Rectangle rect5 = rect4;
        System.out.println(rect4.equals(rect5));

        // Task3
        System.out.println("\n================TASK 3=================");
        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

    }
}

/*
Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

length (длина) — тип double
width (ширина) — тип double
Требования:
Конструкторы:
Создайте конструктор, который инициализирует оба поля класса.
Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в значение 1.0.
Методы:
Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в формате: "Прямоугольник [длина=..., ширина=...]".
Метод main():
В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод toString().
 */
//----------------------------------------------------------------------------------------------------------------------
/*
Task 2: Сравнение объектов класса “Rectangle”
Используя класс Rectangle из первого задания, необходимо реализовать сравнение объектов на равенство по их содержимому.

Требования:
Переопределение метода equals():
Переопределите метод equals() в классе Rectangle, чтобы два объекта считались равными, если у них совпадают значения полей length и width.
Метод main():
Создайте несколько объектов Rectangle, некоторые из которых имеют одинаковые длину и ширину.
Сравните объекты между собой, используя метод equals(), и выведите результаты сравнения на экран.
 */
//----------------------------------------------------------------------------------------------------------------------
/*
Task 3. Опционально задание
Удаление дубликатов из списка объектов “Rectangle”
Создайте метод, который принимает список объектов Rectangle и объект Rectangle, и удаляет из списка все объекты, которые равны переданному объекту (по значению полей length и width).

Требования:
Метод удаления дубликатов:
Реализуйте метод removeDuplicates, который принимает список List и объект Rectangle.
Метод должен удалить из списка все объекты, которые равны переданному объекту (используя переопределённый метод equals()).

Метод main():
Создайте список MyList и добавьте в него несколько объектов, включая дубликаты.
Вызовите метод removeDuplicates, передав ему список и объект Rectangle, дубликаты которого нужно удалить.
Выведите на экран список до и после удаления дубликатов.
Важно!
Будьте внимательны при удалении элементов из списка во время перебора в цикле.
Если вы удаляете элементы из списка, по которому в данный момент итерируетесь, это может привести к ошибкам или пропуску элементов.
Подумайте, как можно правильно организовать цикл, чтобы корректно удалить необходимые элементы без возникновения проблем.
 */
