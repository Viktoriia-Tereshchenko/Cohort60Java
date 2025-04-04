package hw.hw_48;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения
по значению последней цифры в числе и выведите результат на экране

Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.

Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число
умножить на 2, и собрать результат в новый список
 */
public class TaskAll {
    public static void main(String[] args) {

        List<Integer> integers = List.of(9, 17, 18, 33, 22, 4, 101, 203, 1005, 100001);

        //task1(integers);
        task2(List.of("String", "Hello", "Java", "World", "LingString"));
        System.out.println("==========================");
        task2(List.of());

        System.out.println("==========================");
        List<Integer> result = task3(integers);
        System.out.println(result);

    }

    private static List<Integer> task3(List<Integer> integers) {
       return integers.stream()
                .filter(e -> e % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 2)
                .collect(Collectors.toList());
    }

    private static void task1(List<Integer> integers) {

        integers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparing(i -> i % 10))
                // .<Integer>comparingInt сравнивает примитивы
                //.sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.reverseOrder()))
                //.sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10))
//                .sorted(new Comparator<Integer>() {
//                    @Override
//                    public int compare(Integer o1, Integer o2) {
//                        return o1 % 10 - o2 % 10;
//                    }
//                })
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();
    }

    private static void task2(List<String> strings) {
        Optional<String> optionalString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));


        strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length))
                .ifPresentOrElse(
                        str -> System.out.println("Stream: " + str),
                        () -> System.out.println("Stream is null"));


        if (optionalString.isPresent()) {
            System.out.println("min length String: " + optionalString.get());
        } else {
            System.out.println("Строк в списке не найдено");
        }

        // Методы optional
        // ifPresent(Consumer<T> action) - если в Optional что-то есть - выполняется переданное действие
        // ifPresentOrElse - если значение есть, выполняется первое действие (дадут значение),
        // если пусто - выполнится второе действие


        optionalString.ifPresent(str -> System.out.println("ifPresent: " + str));
        //optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(
                str -> System.out.println("Нашли: " + str),
                () -> System.out.println("Ничего не нашли"));
    }
}
