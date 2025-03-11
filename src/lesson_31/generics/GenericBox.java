package lesson_31.generics;

// Мы создаем универсальный класс и не указываем конкретный тип данных, с которым он работает
// Мы хоти определить тип данных при создании каждого объекта
// T (символ заполнитель) - параметр типа (большая латинская буква)

// <T> - означает, что вместо Т при создании объекта будет подставлен конкретный тип данных
// T - type, E - element, K - key, V - value

// Дженерики работают ТОЛЬКО с объектами, т.е. только со ссылочными типами данных!
// Дженерики НЕ работают с примитивными типами!


public class GenericBox <T>{

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
