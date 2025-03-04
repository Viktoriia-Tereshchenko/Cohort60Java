package cons_11.animals;

public class AnimalApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        dog.eat(); // унаследован от Animal
        System.out.println(dog.getName());
        System.out.println(dog.toString());

        System.out.println("\n==============");
        dog.bark(); // метод класса Dog

        Cat cat = new Cat("X");
        cat.setName("Мурка") ; // унаследован от Animal
        System.out.println(cat.toString());
        cat.eat();
    }
}
