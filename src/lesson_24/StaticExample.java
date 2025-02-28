package lesson_24;

/*
Статические члены класса имеют доступ (видят) ТОЛЬКО статический контент
 */


import java.util.Arrays;

public class StaticExample {

    // non - static класса
    int x;

    // static поле класса
    static int staticY;

    // Статический метод
    public static void staticMethod() {
        // Статические методы видят ТОЛЬКО статические члены (поля и методы) класса:
        // x++; не доступа к не-статическому полю
        staticY++; // доступ к статическому полю есть

        // Можем вызывать ТОЛЬКО статические методы
        //nonStaticMethod();

        // Ключевое слово this не доступно в стат-х методов
        //this
        System.out.println(staticY);
    }

    // НЕ статический метод
    public void nonStaticMethod() {
        // У нестатического метода есть доступ КО ВСЕМ членам класса
        x++; // не статика доступна
        staticY++;  // доступ к статическому полю есть
        // может вызывать статические и нестатические методы
        staticMethod();
    }


    // Метод main статический
    public static void main(String[] args) {

        //x = 10; // Ошибка компиляции. У статик метода нет доступа к НЕ-статик переменной
        staticY = 10;
        System.out.println(staticY);

        // nonStaticMethod(); не могу вызвать не-статический метод без создания объекта
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod(); // я могу вызвать не-статик метод только используя ссылку на объект

        // Я могу вызвать статический метод БЕЗ создания объекта
        StaticExample.staticMethod();

        int sum = MathUtil.sumIntegers(1, 2, 5, 6, 7, 8, 9);
        System.out.println("Сумма чисел: " + sum);


    }
}
