package lesson_29.abstracts;

public abstract class Dog extends Animal{

    // Если потомок реализовал НЕ все абстрактные методы родителя,
    // то класс ДОЛЖЕН быть помечен как абстрактный

    @Override
    void move() {
        System.out.println("Dog передвигается");
    }

}
