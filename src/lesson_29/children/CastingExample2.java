package lesson_29.children;

/*
 Объекты могут принадлежать классу X и при этом могут быть приведены к другому типу,
 если между классами есть связь наследования.

 Это называется кастингом (casting).

 Кастинг бывает двух видов:

 - Восходящее преобразование (upcasting) - преобразование объекта дочернего класса в тип родительского класса
 - Нисходящее преобразование (downcasting) - преобразование объекта родительского класса обратно в тип дочернего класса

 */


import lesson_28.animals.*;

public class CastingExample2 {

    public static void main(String[] args) {

        // Восходящее и нисходяще преобразование

        // Восходящее преобразование происходит автоматически
        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal

        /*
        !!! ВАЖНО!!

        Тип ссылочной переменной определяет:
        1. Ссылки на объекты каких типов могут храниться в этой переменной
        2. Список методов, которые можно вызвать, обращаясь к этой переменной
        */

        // Ссылочная переменная может хранить объект своего класса или любого ребенка


        // Какая реализация будет вызвана - определяется типом объекта !
        animal.voice();  //  Cat say MEOW!

        Animal animal1 = new Hamster(); // неявное автоматическое преобразование Hamster к типу Animal

        animal1.voice();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        System.out.println("\n====================");
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        Object obj = new Cat();
        System.out.println(obj.toString());

//        test(new Cat());
//        test(new Dog());
//        test(new Hamster());


        // TODO Нисходящее преобразование

        int intX = 10;
        double doubleX = intX; // неявное автоматическое
        System.out.println(doubleX);

        intX = (int) doubleX; // явное преобразование


        Animal animalD = new Dog(); // Upcasting - восходящее неявное

        Dog dog = (Dog) animalD; // Downcasting - явное нисходящее преобразование

        // animalD.bark(); ошибка   //((Dog) animalD).bark();
        dog.bark();

        Animal animalCat = new Cat();

        // Если попытаться привести объект к неверному типу - будет ошибка компиляции "ClassCastException"
        // Dog dog1 = (Dog) animalCat; // нельзя

        System.out.println("\n====================");
        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();

            // Можно проверить тип объекта для избежания ошибок перед downcasting
            if (currentAnimal instanceof Cat) {  // true
                // System.out.println(i);
                System.out.println("В ячейке " + i + " is a cat");
                Cat catLink = (Cat) currentAnimal;
                catLink.eat(); // специфический метод класса Cat
                System.out.println("\n====================");
            }

            if (currentAnimal instanceof Dog) {
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark();
                System.out.println("\n====================");
            }

        }

    }

//    public static void test(Animal animal) {
//        animal.voice();
//    }
}
