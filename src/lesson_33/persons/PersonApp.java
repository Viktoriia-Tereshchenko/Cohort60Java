package lesson_33.persons;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@mailne.t" , "password"); // Pass: "qwerty1!"
        //System.out.println(person);

        person.setEmail("A@tes.t@ma.i11.lnet.");
        System.out.println(person);

        //Character.isLowerCase();
    }
}
