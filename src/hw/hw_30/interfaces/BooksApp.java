package hw.hw_30.interfaces;

import lesson_30.interfaces.Book;

public class BooksApp {
    public static void main(String[] args) {

        Book book = new Book("Title", "Author");
        book.print();
        book.defaultMethod();
    }
}
