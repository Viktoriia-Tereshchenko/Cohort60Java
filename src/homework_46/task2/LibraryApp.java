package homework_46.task2;
import java.util.Optional;
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

public class LibraryApp {

    public static void main(String[] args) {

        String title = "Три";
        //String title = "Повести";
        Optional<Book> resultBook = Library.findBookByTitle(title);

        if (resultBook.isPresent()) {
            System.out.println(resultBook.get());
        } else {
            System.out.println("Книга не найдена");
        }
    }
}
