
package lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

// Версия ДЗ 23 Сергея (учителя)

public class MyArrayList<T> implements MyList<T> {
    private T[] array; // null
    private int cursor; // по умолчанию = 0 (по типу данных)

    // Методы, расширяющие функционал массива

    // Подавляю предупреждение компилятора о непроверяемом приведении типа
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        // Стирание типов. Невозможно создать объект типа Т
        this.array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(T[] array) {

        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            // (int...numbers) может принять ссылку на масcив int[]
            // СИКВЕНЦИЯ может принять массив !
            addAll(array);
        }
    }

    // getArray() и setArray() НЕ нужны !
    // getCursor() и setCursor() НЕ нужны !


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
    @SuppressWarnings("unchecked")
    private void expandArray() {
        System.out.println("Расширяем внутренний массив! Курсор равен = " + cursor);
        /*
        1. Создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // Shift + Alt + стрелки вверх / вниз для перемещения строк кода

        // 1
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        // 3 Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
    }

    // Добавление в массив нескольких элементов
    // int... - это называется СИКВЕНЦИЯ (последовательность)
    public void addAll(T... numbers) {

        // Перебираю все значения. Для каждого вызываю метод add()
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Возвращает строковое представление массива
    // [5, 20, 45]
    @Override
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
        return null;
    }

    // Удалить элемент по индексу
    public T remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            T value = array[index]; // запомнить старое значение

            // Перебираем элементы начиная с индекса и перезаписываем значения из ячейки справа
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов cursor - 1
                array[i] = array[i + 1];
            }
            cursor--;
            return value; // вернуть старое значение

        } else {
            return null;
        }
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    // Переписать значение по указанному индексу
    @Override
    public void set(int index, T value) {

        if (index >= 0 && index < cursor) {
            // если индекс корректный, присваиваем новое значение
            array[index] = value;
        }
    }


    // Поиск по значению
    // {1, 100, 5, 24, 0, 5} -> indexOf(5) = 2; indexOf(50) = -1;
    public int indexOf(T value) {
        // Перебираю все значимые элементы
        // Если элемент равен искомому - вернуть индекс такого элемента
        // Если перебрал все элементы = не нашел совпадений - вернуть -1

        for (int i = 0; i < cursor; i++) {

            // null - безопасное сравнение
            if (Objects.equals(array[i], value)) {
                //if (array[i] !=null && array[i].equals(value)) {
                // Значения совпали. Возвращаю индекс
                return i;
            }
        }

        // Сюда попадем, если ни одно значение в массиве не совпало
        return -1;
    }


    // Индекс последнего вхождения.
    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(100) -> 6
    public int lastIndexOf(T value) {

        // оптимизированный вариант
        for (int i = cursor - 1; i >= 0; i--) {

            if (Objects.equals(array[i], value)) return i;
            //if (array[i].equals(value)) return i;
        }
        return -1;

        /*
        int index = -1;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                // Значения совпали, обновляю переменную index
                index = i;
            }
        }
        return index;
        */
    }


    // Удаление элемента по значению
    @Override
    public boolean remove(T value) {

        /*
        1. Есть ли элемент с таким значением - indexOf
        2. Если элемента нет - ничего не пытаемся удалить - возвращает false
        3. Если найден - удалить и затем вернуть true
         */

        int index = indexOf(value); // получим индекс первого по очереди значения или -1
        if (index < 0) return false;

        //в эту строчку кода попадем только, при index = 0 или больше
        remove(index);
        return true;
    }

    // Массив, состоящий из элементов магического массива
    @SuppressWarnings("unchecked")
    public T[] toArray() {

        /*
        1. Создать массив размерность cursor (кол-во значимых элементов)
        2. Пройтись по внутреннему массиву и скопировать все элементы в новый дл курсора
        3. Вернуть ссылку на новый массив
         */

        // TODO здесь будет ошибка
//        T[] result = (T[]) new Object[cursor];
//        T[] res = new T[11]; // нельзя создать объект
//        T obj = new T();

        // Взять какой-то объект из моего массива
        // и узнать с помощью рефлексии тип этого объекта
        // Потом создать массив этого типа

        if (cursor == 0) return null;

        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz" + clazz);

        // Создаю массив того же типа, что и 0-й элемент
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public void test() {
        System.out.println(Arrays.toString(array));
    }
}
