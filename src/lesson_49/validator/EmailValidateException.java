package lesson_49.validator;

// extends RuntimeException - для создания НЕ-проверяемых исключений
// extends Exception - для создания проверяемых исключений

public class EmailValidateException extends Exception{

    /*
        getMessage() - возвращает строку с коротким описание исключения
        getCause() - возвращает исключение, которое вызвало текущее исключение
        toString() - строковое представление исключения
        printStackTrace() - выводит трассировку исключения (КРАСНЫЙ текст ошибки)

     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }
}
