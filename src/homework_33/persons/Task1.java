package homework_33.persons;

/*
Task 1
Написать в классе Person метод для проверки валидности пароля
Требования к паролю:
Длина пароля >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква -> Character.isLowerCase()
Должна быть мин 1 большая буква
Должна быть мин 1 специальный символ: "!%$@&*()[],.-"

 */
public class Task1 {
    public static void main(String[] args) {

        Person person = new Person("test@mail.net" , "1"); // Pass: "qwerty1!"
        System.out.println(person);

        System.out.println("\n==============");
        person.setPassword("78$rrtggdtR");
        System.out.println(person);
    }
}
