package lesson_29.children;

public class Parent {
    String name;

    // Автоматически при компиляции (т.к. нет ни одного)
//    public Parent() {
//        // Все поля инициализируется значениями по умолчанию для типа данных
//    }


    public Parent(String name) {
        this.name = name;
    }

    // Невозможно изменить реализацию (переопределить) в наследниках
    final void show() {
        System.out.println("Show must go on");
    }
}
