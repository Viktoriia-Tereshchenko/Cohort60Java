package cons_31;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicDemo {
    public static void main(String[] args) throws Exception {

        Person person = new Person("Alex");

        // РЕФЛЕКСИЯ - можно обратиться к полю во время исполнения
        // используется во Фреймворках во время работы программы

        // нахожу приватное поле name (нужно знать название поля)
        Field nameField = Person.class.getDeclaredField("name");

        // Открываю доступ к приватному полю
        nameField.setAccessible(true);

        // Меняю значение в поле
        nameField.set(person, "Мария");

        // Проверка, сработало ли
        System.out.println("Значение в поле name: " + nameField.get(person));

        // закрываем поле
        nameField.setAccessible(false);

        System.out.println(person);

        Method sayHelloMethod = Person.class.getDeclaredMethod("sayHello");

        // снимаем приватность
        sayHelloMethod.setAccessible(true);

        // вызов метода
        sayHelloMethod.invoke(person); // привет меня зовут Мария

        // восстанавливаем приватность метода
        sayHelloMethod.setAccessible(false);


        System.out.println("\n=================");

        // Получаем класс
        Class<?> personClass = Class.forName("cons_31.Person"); // cons_31/Person.java
        // Получаем конструктор
        Constructor<?> constructor = personClass.getConstructor(String.class);

        // Создаем объект
        Person object = (Person) constructor.newInstance("Сергей");

        System.out.println(object);

        sayHelloMethod.setAccessible(true);
        sayHelloMethod.invoke(object);
        sayHelloMethod.setAccessible(false);

    }
}
