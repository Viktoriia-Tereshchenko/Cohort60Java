package lesson_34.persons;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@mail.net" , "password"); // Pass: "qwerty1!"
        System.out.println(person);

        Person p = new Person("fergrvfdvf", "dfDSf1243f$$");
        //person.setEmail("A@tes.t@ma.i11.lnet.");
        System.out.println(p);

        p.setPassword("JGHFHVDNS<SM12224@");
        System.out.println(p);
    }
}
