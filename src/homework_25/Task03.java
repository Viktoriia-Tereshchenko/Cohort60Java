package homework_25;

/*
Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:

•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
*/

public class Task03 {
    public static void main(String[] args) {


        ImmutablePoint newImPoint = new ImmutablePoint(5, 7);
        //ImmutablePoint.x = 12;
        //System.out.println(newImPoint.getX());
        System.out.println(newImPoint.setX(10));

    }


}
