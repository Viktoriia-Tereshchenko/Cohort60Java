package lesson_21;

// Порядок в классе:
//1. Поля (свойства объекта)
//2. Конструкторы
//3. Состояния (методы)


public class Cat {
    // Характеристики / состояния будущих объектов
    String name; // поле класса
    String color;
    int age;

    /*
    Конструктор класса
    Специальный тип метода, который автоматически вызывается при создании нового объекта
    Основная задача конструктора - установить начальные свойства объекта (проинициализировать его поля)

    Особенности конструктора:
    1. Имя конструктора совпадает с именем класс
    2. Конструктор НЕ имеет типа возвращаемого значения. Даже void не указывается
    (т.к. автоматически возвращает экземпляр класса (объект))
    3. Конструктор вызывается автоматически при создании объекта
     */


    // Конструктор по умолчанию
    // только если в классе нет другого конструктора!!!
    public  Cat() {
        // все поля получают значения по умолчанию для своего типа данных
    }


    // Конструктор - это метод. И я могу передать значения в тело метода (с которыми он вызывается)

    public Cat(String catName) {
        name = catName;

    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;

        // Ключевое слово this используется внутри класса для ссылки на текущий объект
        // Оно поможет при разрешении конфликтов имен полей класса и параметров методов / конструкторов

        // Никто не выдумывает новые переменные, обычно они совпадают!
    }

    public Cat(String name, String color, int age) {

        // this может быть использовано для вызова других конструкторов класса
        // или для передачи текущего объекта в качестве параметра метода (разберем позже)


        // вызов this должен быть ПЕРВОЙ строкой исполняемого кода !!!
        this(name, color); // вызов другого конструктора класса
        // Вызов конструктора, принимающего две String строки
        // Сначала будет выполнен код соответствующего конструктора

        //this.name = name;
        //this.color = color;
        this.age = age;

        /*

        ТИПИЧНЫЙ вид конструктора !

        this.name = name;
        this.color = color;
        this.age = age;

         */
    }

    /*
    public void  test(Cat cat) {
        System.out.println(cat.name);
    }
    */


    // Поведение / методы будущих объектов
    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void run(){
        System.out.println("Я бегу!");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, возраст: %d, мой окрас %s\n", name, age, color);
    }


}
