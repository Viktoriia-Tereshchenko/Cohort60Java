package lesson_15;

public class TernaryOpertor {
    public static void main(String[] args) {

        // Тернарный оператор - краткая форма записи оператора if - else ?
        // которая позволяет присваивать значение переменной в зависимости от условия
        // лучше использовать для коротких простых условий !

        // Введите ваш возраст

        int age = 20;

        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        } else {
            status = "Несовершеннолетний";
        }
        System.out.println(status);

        // переменная = (условие) ? значение_если_True : значение_если_False

        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println("result: " + result);

        int x = -10;

        System.out.println("Значение в переменной х " + ((x >= 0) ? "положительное" : "отрицательное"));
    }
}
