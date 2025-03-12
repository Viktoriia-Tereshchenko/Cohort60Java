package homework_32.task3;

/*
Task 3: Обобщенный класс с ограничениями типов
Создайте обобщенный класс NumericPair, который хранит две числовые переменные
и имеет метод для вычисления их суммы.

Требования:
    Класс должен иметь конструктор для инициализации двух чисел.
    Метод double sum() возвращает сумму этих чисел.

Пример использования:
    NumericPair<Integer> intPair = new NumericPair<>(10, 20);
    System.out.println(intPair.sum()); // Вывод: 30.0

    NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
    System.out.println(doublePair.sum()); // Вывод: 10.0
 */

public class NumPairApp {
    public static void main(String[] args) {

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum()); // Вывод: 30.0
        System.out.println(intPair.toString());

        NumericPair<Integer> intPair2 = new NumericPair<>(null, null);
        System.out.println(intPair2.sum()); // -1.7E308



        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum()); // Вывод: 10.0
        System.out.println(doublePair.toString());

        //NumericPair<String> stringPair = new NumericPair<>("str1", "str2");  // ошибка
    }
}
