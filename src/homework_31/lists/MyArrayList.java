package homework_31.lists;

import java.util.Arrays;

public class MyArrayList <T> implements MyList<T> {
    private T[] array; // null
    private int cursor; // по умолчанию = 0 (по типу данных)

    // Методы, расширяющие функционал массива

    // Подавляю предупреждение компилятора о непроверяемом приведении типа
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        // Стирание типов. Невозможно создать объект типа Т
        this.array = (T[]) new Object[10];
    }

    public MyArrayList(T[] array) {
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];

            // (int...numbers) может принять ссылку на масcив int[]
            // СИКВЕНЦИЯ может принять массив !
            add((T) array);
        }
    }

    // Добавление в массив одного элемента
    public void add(T value) {

        // Проверка! Есть ли свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length) {
            // Расширить внутренний массив перед добавлением нового значения
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Динамическое расширение массива
    private void expandArray() {
        System.out.println("Расширяем внутренний массив! Курсор равен = " + cursor);

        T[] newArray =  (T[]) new Object[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        // 3 Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
    }

    // Добавление в массив нескольких элементов
    // int... - это называется СИКВЕНЦИЯ (последовательность)
    public void addAll(T... values) {

        System.out.println("Принял несколько значений: " + values.length);
        System.out.println(Arrays.toString(values));
        System.out.println("У каждого значения есть индекс, как в масcиве: " + values[0]);

        // Перебираю все значения. Для каждого вызываю метод add()
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    // Возвращает строковое представление массива
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "["; // + 5 , + 25 , ...
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }
        return result;
    }

    // Текущее кол-во элементов в нашем массиве
    public int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    public T get(int index) {
        // Проконтролировать входящий индекс!
        if (index >= 0 && index < cursor) {
            return array[index];
        }

        // Fixme Указать место в коде с ошибкой / проблемой
        // Todo Поправить обработку некорректного индекса
        return null;

    }

    // Удалить элемент по индексу
    public T remove(int index) {

        if (index >= 0 && index < cursor) {
            // Логика удаления
            T value = array[index]; // запомнить старое значение

            // Перебираем элементы начиная с индекса и перезаписываем значения из ячейки справа
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов cursor - 1
                array[i] = array[i + 1];
            }
            array[cursor - 1] = null;
            cursor--;
            return value; // вернуть старое значение

        } else {
            // Индекс не валидный
            // Todo поправить возвращаемое значение
            return null;
        }
    }

    // Поиск по значению
    public int indexOf(T value) {

        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                // Значения совпали. Возвращаю индекс
                return i;
            }
        }
        // Сюда попадем, если ни одно значение в массиве не совпало
        return  -1;
    }


    // Индекс последнего вхождения.
    public int lastIndexOf(T value) {

        // оптимизированный вариант
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    // Удаление элемента по значению
    public boolean remove(T value){

        int index = indexOf(value); // получим индекс первого по очереди значения или -1
        if (index < 0) return false;

        //в эту строчку кода попадем только, при index = 0 или больше
        remove(index);
        return true;
    }

    // Массив, состоящий из элементов магического массива
    public T[] toArray() {

        T[] result = (T[]) new Object[cursor];

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return  result;
    }

    public void test() {
        System.out.println(Arrays.toString(array));
    }

    // Содержит ли массив элемент с таким значением
    @Override
    public boolean contains(T value) {

        if (value == null) {
            System.out.println("Некорректное значение!");
            return  false;
        }

        if (indexOf(value) >= 0) return true;

        return false;
    }

    // Является ли коллекция пустой
    // Если элементов в коллекции нет - вернет true
    @Override
    public boolean isEmpty() {

        if (cursor == 0) return true;

        return false;
    }

    // Перезаписывает значение по указанному индексу
    @Override
    public void set(int index, T value) {

        if (index < 0 || index >= cursor) {
            System.out.println("Некорректный index!");
            return;
        }

        if (value == null) {
            System.out.println("Некорректное значение!");
            return;
        }

        array[index] = value;
    }

}
