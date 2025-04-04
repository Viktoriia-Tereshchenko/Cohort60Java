package homework_49;

public class PersonValidator {

    public static void validatePassword(String password) throws PasswordValidateException {

        if (password == null || password.length() < 8) throw new PasswordValidateException("password is too short");

        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecialSymbol = false;

        String symbols = "!%$@&*()[],.-";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true; // символ - цифра
            if (Character.isUpperCase(ch)) isUpperCase = true; // символ - большая буква
            if (Character.isLowerCase(ch)) isLowerCase = true; // символ - маленькая буква
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true; // символ - специальный символ
        }

        if (!isDigit) throw new PasswordValidateException("password should have numbers");
        if (!isUpperCase) throw new PasswordValidateException("password should have capital letters");
        if (!isLowerCase) throw new PasswordValidateException("password should have small letters");
        if (!isSpecialSymbol) throw new PasswordValidateException("password should have special symbols");
    }


    public static void validateEmail(String email) throws EmailValidateException {

        // throw - ключевое слово, используется для явного выброса исключения
        // (создания объекта исключения)

        if (email == null) throw new EmailValidateException("email should be not null");

        // 1. Должна присутствовать @ и только одна
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("@ error");

        //2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");


        // 3. После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        //if (lastDotIndex + 2 >= email.length()) return false;
        if (lastDotIndex >= email.length() - 2) throw new EmailValidateException("last . error");

        // 4. Допустимые символы: алфавит, цифры, '-', '_', '@', '.'
        // String.toCharArray() - возвращает массив char[]
        for (char ch : email.toCharArray()) {
            // проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';

            if (!isPass) throw new EmailValidateException("Illegal symbol");
        }

        // 5. До собаки должен быть хотя бы один символ. Т.е. индекс собаки не равен 0
        if (indexAt == 0) throw new EmailValidateException("@ should be not first");

        // 6. Первый символ - должна быть буква. Символ с индексом 0 - буква
        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("First symbol should be letter");

        // Все проверки пройдены. Email подходит
    }
}
