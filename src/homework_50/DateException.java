package homework_50;

public class DateException extends Exception {

    public DateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "DateException | " + super.getMessage();
    }
}
