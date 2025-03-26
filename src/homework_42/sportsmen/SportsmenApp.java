package homework_42.sportsmen;


/*
Task 1
Создайте класс Sportsman с тремя полями: name (имя), age (возраст) и score (рейтинг).
Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать “естественный” порядок сортировки, например, по name.
Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.
В методе main создайте массив из нескольких объектов Sportsman.
Отсортируйте его с использованием:
естественного порядка, определенного в Comparable,
данного класса Comparator,
анонимного класса Comparator для сортировки по третьему полю (например, age).
Выведите каждый вариант отсортированного массива в консоль.
 */

import java.util.Arrays;
import java.util.Comparator;

public class SportsmenApp {
    public static void main(String[] args) {

        Sportsman[] sportsmen = new Sportsman[5];
        sportsmen[0] = new Sportsman("Tom", 22, 65.8);
        sportsmen[1] = new Sportsman("Bob", 24, 72.0);
        sportsmen[2] = new Sportsman("Nik", 21, 68.1);
        sportsmen[3] = new Sportsman("Hanna", 23, 69.9);
        sportsmen[4] = new Sportsman("Bill", 25, 71.5);

        System.out.println("Сортировка по имени (ест.порядок)");
        Arrays.sort(sportsmen);
        printSportsmen(sportsmen);


        System.out.println("Сортировка по рейтингу (обр.порядок)");
        Arrays.sort(sportsmen, new ScoreComparator());
        printSportsmen(sportsmen);


        System.out.println("Сортировка по возрасту (ест.порядок)");
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sm1, Sportsman sm2) {
                return Integer.compare(sm1.getAge(),sm2.getAge());
            }
        });
        printSportsmen(sportsmen);
    }


    public  static  void printSportsmen(Sportsman[] sportsmen) {
        System.out.println("-------------------------------------------");
        for (Sportsman sportsman : sportsmen) {
            System.out.println(sportsman);
        }
        System.out.println("-------------------------------------------\n");
    }
}
