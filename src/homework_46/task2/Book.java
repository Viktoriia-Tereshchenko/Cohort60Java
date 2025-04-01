package homework_46.task2;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return  String.format("Книга: %s, автор %s", title, author);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
