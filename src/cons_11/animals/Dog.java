package cons_11.animals;

public class Dog extends Animal {

    // Чтобы создать объект потомка, нужно сначала создать объект родителя


    public Dog(String name) {
        // super(); автоматически при компиляции, если я не указала сама
        // Первой строкой вызывается конструктор родителя
        super(name);
    }

    void bark() {
        System.out.println(name + " barks");
    }
}
