package lesson_29.children;

public class App {
    public static void main(String[] args) {

        Parent parent =new Parent("Name");
        System.out.println(parent.name);

        Child child = new Child();
        System.out.println(child.name);
        System.out.println(child.age);


        Child child2 = new Child("Name2", 15);
        child2.show();
    }
}
