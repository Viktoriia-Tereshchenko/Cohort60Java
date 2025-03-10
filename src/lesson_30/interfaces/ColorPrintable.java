package lesson_30.interfaces;

// Интерфейс может расширять другой интерфейс (ключ.слово extends)
// дочерний интерфейс наследует все методы родительского интерфейса

public interface ColorPrintable extends Printable{

    void colorPrint();

}
