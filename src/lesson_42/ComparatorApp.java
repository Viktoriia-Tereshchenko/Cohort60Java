package lesson_42;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = new int[]{9, 5, 1, 2, 4, 11, 0};

        // Сравнение строк "в лексо-графическом порядке", НО чувствительно к регистру!!!
        // apple < banana
        // Zebra < apple
        // Apple < apple


        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021,250);

        printCars(cars);

        Arrays.sort(cars);

        // Интерфейс Comparable<T> (с англ. "сравнимый")
        // определяет только один порядок сортировки, встроен внутри класса!


        // Интерфейс Comparator<T> (с англ. "сравнивать")
        // внешний инструмент (не в классе), чтобы задать несколько вариантов сортировки!

        printCars(cars);

        CarSpeedComparator speedComparator = new CarSpeedComparator();

        Arrays.sort(cars, speedComparator);
        printCars(cars);

        System.out.println("==============\n");

        Arrays.sort(cars, new CarModelComparator());
        printCars(cars);

        System.out.println("========АК=======\n");


        // Анонимный класс - это класс для создания объекта на лету - без явного объявления нового класса.
        // Используются АК, когда необходим одноразовый объект

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });
        printCars(cars);


        // отсортировать машины по году выпуска в обратном порядке
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            // 4, 1, 10
            // -> 1, 4, 10
            // -> 10, 4, 1

            // a vs b -> a - b ->
            // 4 vs 10 -> 10, 4 (b - a)
            public int compare(Car c1, Car c2) {
                //return (c1.getYear() - c2.getYear()) * (-1);
                return c2.getYear() - c1.getYear();  // меняем местами
            }
        });
        printCars(cars);
        System.out.println("==============\n");


        // сравнить машины по году выпуска в порядке возрастания,
        // а если год совпадает, тогда такие машины сравнить по модели в порядке убывания

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();

                if (yearCompare != 0) {
                    return  yearCompare;
                } else {
                    // годы машин равны (yearCompare = 0)
                    // обратный порядок по модели
                   return c2.getModel().compareTo(c1.getModel());
                }
            }
        });
        printCars(cars);

        // Функциональный интерфейс - это интерфейс, который имеет РАВНО ОДИН абстрактный метод. (метод который нужно реализовать)
        // НО в таком интерфейсе могут быть статические или дефолтные методы!

        // Интерфейс Comparator - функциональный интерфейс

        /*
        Лямбда-выражения - это краткий способ реализаций анонимных функций (методов) в Java
        Компактный синтаксис для реализации методов функциональных интерфейсов

        (parameters) -> expression;   // expression - выражение
        или
        (parameters) -> {statements};    // {statements} - блок кода

        Лямбда-выражения во многих случаях могут заменить анонимные классы и реализовывать
        на лету функциональные интерфейсы
         */

        // по году в обратном порядке с использованием лямбда

        Arrays.sort(cars, (car1, car2) -> {
            return car2.getYear() - car1.getYear();
        });
        printCars(cars);


        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());
        printCars(cars);

        // отсортировать машины по максимальной скорости в порядке убывания
        // если скорость совпадает - отсортировать по году - естественный порядок (от младшей к старшей)

        Comparator<Car> carComparator = (c1, c2) -> {
            System.out.println(c1.getMaxSpeed() + " | " + c2.getMaxSpeed());
            //int speedCompare = c1.getMaxSpeed() - c2.getMaxSpeed();
            int speedCompare = Integer.compare(c1.getMaxSpeed(),c2.getMaxSpeed());

                    System.out.println("c1 -c2: " + speedCompare);

            // -2147483648 vs 100 | -2147483648 - 100 ? 2147483548

            if (speedCompare == 0) {
                //return c1.getYear() - c2.getYear();
                return Integer.compare(c1.getYear(),c2.getYear());
            }
            return speedCompare;
        };

        Arrays.sort(cars, carComparator);
        printCars(cars);


        //  ДЛЯ БЕЗОПАСНОСТИ ИСПОЛЬЗУЕМ метод compare оберточных классов
        // Integer.compare() , Double.compare() и т.д.


        // Comparator - имеет набор статических и дефолтных методов, облегчающих написание
        // сложных / составных компараторов

        // метод comparing - позволяет сортировать объекты по ключу
        // Функция-ключ - это способ вытащить из объекта то значение,
        // по которому мы хотим сравнивать два объекта
        /*
        car -> car.getYear()
        Car::getModel
         */


        // отсортировать машины по модели в естественном порядке
        System.out.println("-----comparing------");
        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars, byModel);
        printCars(cars);

        // ссылка на метод - это сокращенная запись лямбда
        Arrays.sort(cars,Comparator.comparing(Car::getModel));
        printCars(cars);

        // Специальные версии метода для сравнения примитивов. Избежать авто-упаковки/распаковки
        // comparingInt, comparingLong, comparingDouble - для ускорения

        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));

        /*
        Второй параметр метода comparing
        Comparator.naturalOrder() - определяет естественный порядок сортировки
        Comparator.reverseOrder() - определяет обратный порядок сортировки
        Comparator.nullsFirst - значение null признаны как наименьшие (т.е. будут располагаться слева)
        Comparator.nullsLast - значение null признаны как наибольшие (т.е. будут располагаться справа)

         Comparator.comparing(класс::метод).thenComparing(класс::другойМетод) - Это выражение создаёт компаратор,
         который сначала сравнивает объекты по результату метода метод. Если объекты равны (то есть сравнение возвращает 0),
         то сравнение производится по другому ключу (который вернет другойМетод)

        .reversed()
         */


        // Отсортировать по году выпуска в порядке убывания
        // Comparator.reverseOrder() - в обратном порядке
        System.out.println("---reverseOrder-------");
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

        //cars[5] = new Car(null, 2021, 250);

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.reverseOrder())));
        printCars(cars);

        System.out.println("========================");

        // Отсортировать по модели. Если модели равны, то отсортировать по убыванию годы выпуска
        // Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)).thenComparing(Car::getYear, Comparator.reverseOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

        System.out.println("===========Make!===========");
        // Отсортировать по модели по году выпуска, если год равен - отсортировать по модели в обратном порядке
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel, Comparator.reverseOrder()));
        printCars(cars);



        // Отсортировать по году в обратном, если год равен - отсортировать по макс. скорости в прямом
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(car -> car.getMaxSpeed()));
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed());
        printCars(cars);
    }

    public  static  void printCars(Car[] cars) {
        System.out.println("======================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("======================\n");
    }
}
