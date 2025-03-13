package homework_33.persons;

public class Person {

    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
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
        if (isPassswordValid(password)) {
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
     */

    public boolean isPassswordValid(String password) {

        boolean condition1 = false;
        boolean condition2 = false;
        boolean condition3 = false;
        boolean condition4 = false;
        boolean condition5 = false;

        String specialSymbols = "!%$@&*()[],.-";

        if (password == null) return false;

        // 1. Длина пароля >= 8
        if (password.length() >= 8) condition1 = true;

        // 2-5 условия
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) condition2 = true; // символ - цифра
            if (Character.isLowerCase(ch)) condition3 = true; // символ - маленькая буква
            if (Character.isUpperCase(ch)) condition4 = true; // символ - большая буква
            if (specialSymbols.indexOf(ch) >=0) condition5 = true; // символ - специальный символ
        }

        return condition1 && condition2 && condition3 && condition4 && condition5;
    }


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
