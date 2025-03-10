package lesson_30.flyable;

// Множественная реализация интерфейсов - ЕСТЬ
// в Java НЕТ множественного наследования классов

public class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}

// Class B extends A, A extends C; != class B extends A, C;