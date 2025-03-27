package lesson_43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих
        // его интерфейсов (List Queue, Set)
        // Это позволяет нам единообразно обрабатывать различные типы коллекций

        // ВАЖНО : При работе с коллекциями - ссылка типа интерфейс !!!
        // тип ссылки:
        // -> набор доступных методов
        // -> ссылку на объект какого класса может хранить эта переменная
        // Справа можем подставить объекты разных классов (получить разные реализации этого интерфейса)

        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();

        // int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает true, если коллекиця пуста
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add(T t) - добавляет элемент в коллекцию
        strings.add("Java");
        System.out.println("strings.add(\"Pytjon\"): " + strings.add("Pytjon"));

        // Переопределенный метод toString кля красивого вывода элементов коллекции
        System.out.println(strings);

        // Статический метод .of() - метод в нескольких интерфейсах и классах JFC
        // был введен в Java 9 (SDK 9 и выше)
        // Создает неизменяемую (нельзя удалить или добавить элементы) коллекцию из предоставленных элементов
        // Доступен для List, Set, Map

        Collection<Integer> integers = List.of(0, 1, 2, 3, 5, 6);
        System.out.println("integers:" + integers);
        //integers.add(7);
        // попытка модифицировать (изменить) неизменяемую коллекцию приведет к ошибке (Исключительная аварийная ситуация)

        // Методы addAll, removeAll, retainAll - это программная реализация операций над множествами в математике

        // (СЛОЖЕНИЕ)
        // addAll(Collection<? extends T> col) - добавит все элементы из указанной коллекции
        strings.addAll(List.of("JS", "Go Land", "Ruby", "Kotlin"));

        System.out.println(strings);

        System.out.println("=============================");

        // (ВЫЧИТАНИЕ)
        // removeAll(Collection<? extends T> colB) - удаляет все элементы содержащиеся в коллекции colB
        // из коллекции, на которой вызван метод
        //  colA.removeAll(colB) - удаляет из А все элементы, которые содержит кол B (ВЫЧИТАНИЕ)
        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));

        colA.removeAll(List.of(3, 2, 1, 10));
        System.out.println("colA.removeAll(List.of(3, 2, 1)): " + colA);

        // (ПЕРЕСЕЧЕНИЕ)
        // retainAll(Collection<?> colB) - оставляет в коллекции вызова только те элементы, которые содержатся в коллекции В.
        // = удаляет из коллекции вызова элементы, которые НЕ содержать в коллекции В
        // colA.retainAll(colB) - оставляет в А только те элементы, которые также есть в В

        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 60));
        colB.addAll(List.of(20, 30, 40, 100));

        System.out.println("colA:" + colA);
        System.out.println("colB:" + colB);

        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB):" + colA);
        colB.retainAll(colA);
        System.out.println("colB.retainAll(colA):" + colB);


        // boolean containsAll(Collection<?> c) - возвращает true, если коллекция содержит все элементы из указанной коллекции
        System.out.println("colA.containsAll(List.of(20, 30)):" + colA.containsAll(List.of(20, 30))); // true
        System.out.println("colA.containsAll(List.of(20, 30, 50)):" + colA.containsAll(List.of(20, 30, 50))); // false


        // boolean remove(Object obj) - удаляет элемент из коллекции, вернет true - если элемент был удален
        // удалит ОДНО значение, даже если таких элементов несколько
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(20): " + colA.remove(20));
        System.out.println("colA:" + colA);

        // Если нужно удалить все вхождения -> используем removeAll(List.of())
        colA.removeAll(List.of(20));
        System.out.println(colA);


        // clear() - удаляет все элементы из коллекции
        colA.clear();
        System.out.println("colA:" + colA);
    }
}
