package homework_46.task2;
/*
Task 2
Поиск книги в библиотеке.
Создайте класс Library, в котором хранится список книг.
У каждой книги есть название (title) и автор (author).

Реализуйте метод:
Optional<Book> findBookByTitle(String title)

Он должен возвращать Optional — книгу, если она найдена, или Optional.empty(), если такой книги нет.

Что нужно сделать:
Создайте класс Book с полями title и author, и сделайте для них геттеры.
Создайте класс Library, в котором будет список книг.
Реализуйте метод findBookByTitle, который ищет книгу по названию.
В main() методе попробуйте:
Найти книгу, которая точно есть.
Найти книгу, которой нет.
Вывести информацию о книге, если она найдена.
Вывести "Книга не найдена", если её нет.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Три мушкетёра", "А. Дюма"));
        books.add(new Book("Граф Монте-Кристо", "А. Дюма"));
        books.add(new Book("Робинзон Крузо", "А. Дефо"));
    }

    public static Optional<Book> findBookByTitle(String title) {

        if (title == null || title.isEmpty()) {
            return Optional.empty();
        }

        for (Book book : books){
            if (book.getTitle().contains(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String title = "Три";
        //String title = "Повести";
        Optional<Book> resultBook = findBookByTitle(title);

        if (resultBook.isPresent()) {
            System.out.println(resultBook.get());
        } else {
            System.out.println("Книга не найдена");
        }
    }
}
