package homework_23;

import java.util.Arrays;

public class MagicArrayEncaps {
    private int[] array;
    private int cursor;

    // Конструктор по умолчанию
    public MagicArrayEncaps() {
        this.array = new int[10]; // [0, 0 ... 0]
    }

    // Конструктор, принимающий обычный массив. Создать магический массив с элементами из этого массива
    public MagicArrayEncaps(int[] array) {

        if (array == null || array.length == 0) {
            this.array = new int[10];
        } else {
            this.array = new int[array.length * 2];
            add(array);
        }
    }

    //public int getCursor(){} не нужен, есть уже реализованный метод size()

    // Добавление в массив одного элемента
    public void add(int value) {

        if (cursor == array.length) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Динамическое расширение массива
    private void expandArray() {
        //System.out.println("Расширяем внутренний массив! Курсор равен = " + cursor);

        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Добавление в массив нескольких элементов
    // int... - это называется СИКВЕНЦИЯ (последовательность)
    public void add(int... numbers) {
        /*
        // с numbers я могу обращаться точно также, как ссылкой на массив int
        System.out.println("Принял несколько int: " + numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println("У каждого инта есть индекс, как в масcиве: " + numbers[0]);
        */

        // Перебираю все значения. Для каждого вызываю метод add()
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
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
    public int get(int index) {
        // Проконтролировать входящий индекс!
        if (index >= 0 && index < cursor) {
            return array[index];
        }

        // Fixme Указать место в коде с ошибкой / проблемой
        // Код, если индекс не корректный
        // Хорошего решения нет
        return -2_147_483_647;
        // Todo Поправить обработку некорректного индекса
    }

    // Удалить элемент по индексу
    public int remove(int index) {

        if (index >= 0 && index < cursor) {

            int value = array[index]; // запомнить старое значение
            // Перебираем элементы начиная с индекса и перезаписываем значения из ячейки справа
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value; // вернуть старое значение

        } else {
            // Индекс не валидный
            // Todo поправить возвращаемое значение
            return -2_147_483_647;
        }
    }

    // Поиск по значению
    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                // Значения совпали. Возвращаю индекс
                return i;
            }
        }
        return  -1;
    }

    // Индекс последнего вхождения.
    public int lastIndexOf(int value) {

        // оптимизированный вариант (идем с конца)
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    // Удаление элемента по значению
    public boolean removeByValue(int value){

        int index = indexOf(value);
        if (index < 0) return false;
        remove(index);
        return true;
    }

    // Массив, состоящий из элементов магического массива
    // Task 2
    public int[] toArray() {

        int[] newArray = new int[cursor];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        return  newArray;
    }

    public void test() {
        System.out.println(Arrays.toString(array));
    }
}
