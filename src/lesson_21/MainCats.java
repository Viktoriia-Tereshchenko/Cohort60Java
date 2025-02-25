package lesson_21;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Cоздание объекта класса Cat
        // 1. Физически в памяти создается объект типа Cat
        // 2. Вызывается конструктор класса для инициализации свойств объекта
        // (т.е. заполнения полей значениями)

        /*
        При создании объекта класса все его поля инициализируются какими-то значениями
        По умолчанию (если не задано другое поведение) поля инициализируются значениями
        по умолчанию для своего типа данных
        для числовых примитивов -> 0 /0.0
        boolean -> false
        для всех ссылочных (в том числе String) -> null
         */

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + cat.age);

        System.out.println("\n=====================\n");
        Cat cat1 = new Cat("Max");
        // будет создан новый объект класса Cat
        // Имя(строка), которая была передана в конструктор будет присвоена свойству name объекта класса

        System.out.println("cat1.name: " + cat1.name);
        System.out.println("cat1.color: " + cat1.color);

        cat.whoAmI();
        cat1.whoAmI();

        System.out.println("\n=====================\n");
        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();

        Cat barsik = new Cat("Barsik", "white", 2);
        System.out.println("barsik.name: " + barsik.name);
        System.out.println("barsik.color: " + barsik.color);
        System.out.println("barsik.age: " + barsik.age);
        barsik.whoAmI();

        Cat catClone = barsik;
        catClone.whoAmI();
        barsik.age = 100;
        System.out.println("\nbarsik.age = 100");
        barsik.whoAmI();
        catClone.whoAmI();

        System.out.println("\n=====================\n");
        catClone = new Cat("Kratos", "black", 66);
        catClone.whoAmI();
        barsik.whoAmI();

        catClone = null; // Нет привязки к объекту, null - ничто. Ссылка не ссылается ни на какой объект
        // Если у перременной, значение которой null попытать вызвать метод, получить свойство -
        // то программа завершиться ошибкой NullPointerException (NPE)
        // У null нельзя вызвать метод, присвоить или получить значения поля - NPE

//        System.out.println(catClone.age);
//        catClone.age = 44;
//        catClone.whoAmI();

        if (catClone != null) {
            System.out.println(catClone.name);
            catClone.whoAmI();
        } else {
            System.out.println("В переменной храниться null");
        }
    }
}
