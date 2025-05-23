package lesson_34.persons;

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    /*
    test@cemail.com.net

    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. После последней точки есть 2 или более символов
    4. Допустимые символы: алфавит, цифры, '-', '_', '@', '.'
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква

     */
    public boolean isEmailValid(String email) {

        if (email == null) return false;

        // 1. Должна присутствовать @ и только одна
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        //2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;


        // 3. После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        //if (lastDotIndex + 2 >= email.length()) return false;
        if (lastDotIndex >= email.length() - 2) return false;

        // 4. Допустимые символы: алфавит, цифры, '-', '_', '@', '.'
        /*
        Перебираю все символы в строке. Проверяю текущий символ.
        Если нахожу хоть один "не правильный" сразу возвращаю false
         */

        // String.toCharArray() - возвращает массив char[]
        for (char ch : email.toCharArray()) {
            // проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';
            // Если символ не подходит (isPass = false) возвращаем false
            if (!isPass) return false; // классическая проверка: делай что-то, если переменная false


        }

        // 5. До собаки должен быть хотя бы один символ. Т.е. индекс собаки не равен 0
        if (indexAt == 0) return false;

        // 6. Первый символ - должна быть буква. Символ с индексом 0 - буква
        if (!Character.isLetter(email.charAt(0))) return false;

        // Все проверки пройдены. Email подходит
        return true;
    }

    /*
    Требования к паролю:
    1. Длина пароля >= 8
    2. Должна быть мин 1 цифра
    3. Должна быть мин 1 маленькая буква -> Character.isLowerCase();
    4. Должна быть мин 1 большая буква
    5. Должен быть мин 1 специальный символ: "!%$@&*()[],.-";

    Пароль должен удовлетворять ВСЕМ требованиям сразу.
    5 boolean переменных. Каждая отвечает за свой пункт.
    Пароль подходит только если все пять - имеют true.
     */

    public boolean isPasswordValid(String password) {

        if (password == null || password.length() < 8) return false;

        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecialSymbol = false;

        // альтернативный способ объявления переменных
        boolean[] result = new boolean[4]; // false, false, false, false

        String symbols = "!%$@&*()[],.-";

        if (password == null || password.length() < 8) return false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true; // символ - цифра
            if (Character.isUpperCase(ch)) isUpperCase = true; // символ - большая буква
            if (Character.isLowerCase(ch)) isLowerCase = true; // символ - маленькая буква
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true; // символ - специальный символ
            // if (symbols.contains("" + ch)) isSpecialSymbol = true;
            // if (symbols.contains(String.valueOf(ch))) isSpecialSymbol = true;
        }
        System.out.printf("%s | %s | %s | %s\n", isDigit, isUpperCase, isLowerCase, isSpecialSymbol);

        // если хотя бы одна из переменных останется в значении false, то весь пароль
        // НЕ будет призван валидным (вернется false)
        return isDigit && isLowerCase && isUpperCase && isSpecialSymbol;
    }


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
