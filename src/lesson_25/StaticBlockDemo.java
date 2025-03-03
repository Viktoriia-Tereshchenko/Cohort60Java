package lesson_25;

public class StaticBlockDemo {

    // Поля "читаются" сверху вниз
    static int counter = 5;
    static String[] colors = new String[counter];

    private String title;
    private int capacity = 10;  // Инициализация значения (capacity - вместимость)

    // Статический блок инициализации
    // В нем могут быть проинициализированы статические поля класс (присвоены значения)
    // Вызывается ровно один раз в момент загрузки класса в JVM (до вызова конструктора)
    static {
        System.out.println("StaticBlock RUN");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

//    static {
//        System.out.println("StaticBlock 2 RUN");
//    }

    // НЕ статические блоки инициализации
    // Выполняются при КАЖДОМ создании объекта
    // Вызывается до конструктора
    {
        System.out.println("NON-static block RUN!");
        //this.title = "DEFAULT";
        if (counter == 0) {
            this.capacity = 50;
        }

        title = "DEFAULT";
    }

//    {
//        System.out.println("NON-static block 2 RUN!");
//    }

    // по умолчании при компиляции создается конструктор по умолчанию
    public StaticBlockDemo() {
        System.out.println("Constructor RUN!");
        // Проверку private полей пишем в конструкторе !
//        if (counter == 0) {
//            this.capacity = 50;
//        }

//        colors[0] = "red";
//        colors[1] = "green";
//        colors[2] = "yellow";

    }

    // конструктор 2
    public StaticBlockDemo(String title) {
        System.out.println("Constructor 2 RUN!");
//        if (counter == 0) {
//            this.capacity = 50;
//        }

        this.title = title;
    }


    public String toString() {
        return String.format("Title: %s, capacity: %d, static-counter: %d", title, capacity, counter);
    }

}
