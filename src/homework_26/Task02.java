package homework_26;

/*
Task 2
Придумать и написать как минимум одну иерархию классов в которой будет один
родительский клас и два наследника, расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией
об объекте (метод String toString())
 */

public class Task02 {
    public static void main(String[] args) {

        Apple apple = new Apple("Яблоко", 200, "red");
        System.out.println(apple.toString());

        apple.setVariety("Golden");
        System.out.println("сорт яблока: " + apple.getVariety());

        Banana banana = new Banana("Банан", 150, "yellow");
        System.out.println(banana.toString());

        banana.setExportCountry("Costa Rica");
        System.out.println("страна-экспортер: " + banana.getExportCountry());

    }
}
