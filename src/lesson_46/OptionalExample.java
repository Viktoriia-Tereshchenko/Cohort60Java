package lesson_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(10, "Peter", 25));
        users.add(new User(5, "Max", 18));
    }

    public static void main(String[] args) {

        // Optional<T> это класс-обертка, который может содержать значение типа Т,
        // а может не содержать (быть пустым)

        // Основная задача - уменьшить количество ошибок, возникающих при обращении к null

        // 99% используем как возвращаемое значение из метода !!!!
        // (нельзя использовать как поле класса или как аргумент метода)

        Optional<User> optUser = getById2(1);
        System.out.println(optUser.get());


        optUser = getById2(10);


        // boolean isPresent() - Мы можем проверить, есть ли в обертке значение
        if (optUser.isPresent()) {
            // Метод get() - позволяет получить значение, завернутое в Optional
            // если вызвать его на пустом (содержащим null) - получим NPE
            User user = optUser.get();
            System.out.println("user: " + user);
            System.out.println("Имя: " + user.getName());
        } else {
            System.out.println("Пользователь не найден");
        }

        // boolean isEmpty() - вернет true, если Optional пустой

        // orElse(T defaultValue) - распакует из Optional объект, если он есть
        // или вернет значение по-умолчанию
        User current = getById(1).orElse(null);
        System.out.println("getById(1).orElse(null) :" + current);

        // NPE
        // System.out.println(optUser.getName());
    }

    /*
    Как создать Optional

    1.  Optional.of(value) - создает Optional, содержащий значение (не пустой и не null).
        Если передать null - будет ошибка

    2.  Optional.empty() - создает пустой Optional

    3.  Optional.ofNullable(value) - создает Optional, который содержит значение или null
     */

    // Обертка указывает на необходимость проверки на null
    public static Optional<User> getById(int id) {
        // Список пользователей.
        // Перебираем пользователей, сравниваем id
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        //return  Optional.of(null); // ошибка
        return Optional.empty();
    }


    public static Optional<User> getById2(int id) {

        User result = null;

        for (User user : users) {
            if (user.getId() == id) {
                result = user;
            }
        }
        return Optional.ofNullable(result);
    }

}
