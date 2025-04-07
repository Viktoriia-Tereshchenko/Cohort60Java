package hw.hw_49;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@gmail.com", "qwerty");
        System.out.println(person);
        System.out.println("==========================\n");

        System.out.println(new Person("testgmail.com", "qwertyQ1111") + "\n");
        System.out.println(person);


        System.out.println("==========================\n");
        // TODO -> Если пароль не проходит по нескольким параметрам
        //  -> выдать сообщение об ошибке с указанием всех пунктов
        Person person2 = new Person("test@gmail.com", "qwerty222222");
        System.out.println(person2);

    }
}
