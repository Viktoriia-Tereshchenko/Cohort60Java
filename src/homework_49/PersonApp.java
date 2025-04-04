package homework_49;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@gmail.com", "Qwerty&123");
        System.out.println(person);
        System.out.println("===========================");

        System.out.println(new Person("test@gmail.com", "Qwerty") + "\n");
        System.out.println(new Person("test@gmail.com", "Qwerty@@@") + "\n");
        System.out.println(new Person("test@gmail.com", "qwerty@123") + "\n");
        System.out.println(new Person("test@gmail.com", "QWERTY@123") + "\n");
        System.out.println(new Person("test@gmail.com", "Qwerty123") + "\n");
    }
}
