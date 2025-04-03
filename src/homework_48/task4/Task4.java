package homework_48.task4;

/*
Task 4 Опционально
Практикуем groupingBy
Есть класс Student, описывающий студентов университета.
Создай список студентов (List) — минимум 10 объектов, с разнообразными значениями.

Задания:
1)Группировка по специальности
Сгруппируй студентов по специальности (поле major) в Map<String, List>.

2)Группировка по курсу с использованием Set
Сгруппируй студентов по курсу (year), при этом сохрани их в виде Set.

3)Подсчёт количества студентов по специальности
Построй Map<String, Long>, где ключ — специальность, а значение — количество студентов на этой специальности.

4)Средний балл по специальности
Построй Map<String, Double>, где ключ — специальность, а значение — средняя оценка студентов на этой специальности.

5)Список оценок по специальности
Построй Map<String, List>, где хранятся только оценки по каждой специальности.

6)Суммарная статистика по возрасту
Используй IntSummaryStatistics, чтобы получить:
- минимальный возраст,
- максимальный возраст,
- средний возраст,
- общее количество студентов,
- сумму всех возрастов.

Требования:
Вся логика должна быть оформлена в main().
Не забудь добавить toString() в класс Student для красивого вывода.
Постарайся использовать Stream API и Collectors как на уроке.

🔄 Дополнительно (по желанию):
Сгруппируй студентов по курсу, и внутри каждого курса сгруппируй по специальности:
 → Map<Integer, Map<String, List>>
 */

import lesson_47.groupingBy.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {

        // курс - c 1 по 5-й
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("Vlad", 18, "Informatics", 1, 4.5),
                        new Student("Oleg", 19, "Informatics", 2, 4.2),
                        new Student("Hanna", 19, "Informatics", 2, 5.0),

                        new Student("Alice", 19, "Biology", 2, 4.3),
                        new Student("Frank", 23, "Biology", 4, 4.7),
                        new Student("Helga", 23, "Biology", 5, 4.0),

                        new Student("Jack", 19, "Mathematics", 1, 4.8),
                        new Student("David", 22, "Mathematics", 4, 3.9),

                        new Student("Tom", 22, "Physics", 3, 4.1),
                        new Student("Leon", 21, "Physics", 2, 4.7)
                ));

        // 1. Группировка по специальности
        Map<String, List<Student>> groupByMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));

        printMap(groupByMajor);

        //2. Группировка по курсу с использованием Set
        Map<Integer, Set<Student>> groupByYear = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));

        printMap(groupByYear);
        System.out.println("На 1м курсе: " + groupByYear.get(1));
        System.out.println("На 3м курсе: " + groupByYear.get(3));
        System.out.println("============================================");


        // 3. Подсчёт количества студентов по специальности
        Map<String, Long> countInMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));

        printMap(countInMajor);


        // 4. Средний балл по специальности
        Map<String, Double> averageGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.averagingDouble(Student::getGrade)));

        printMap(averageGrade);


        // 5. Список оценок по специальности
        Map<String, List<Double>> gradeLists = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.mapping(Student::getGrade, Collectors.toList())));

        printMap(gradeLists);

        // 6. Суммарная статистика по возрасту
        IntSummaryStatistics statistics = students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));

        System.out.println("Минимальный возраст: " + statistics.getMin());
        System.out.println("Максимальный возраст: " + statistics.getMax());
        System.out.println("Средний возраст: " + statistics.getAverage());
        System.out.println("Общее количество студентов: " + statistics.getCount());
        System.out.println("Сумма всех возрастов  " + statistics.getSum());
        System.out.println("============================================");

        // 7. Сгруппируй студентов по курсу, и внутри каждого курса сгруппируй по специальности
        Map<Integer, Map<String, List<Student>>> groupByYearThenByMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getYear,
                        Collectors.groupingBy(Student::getMajor, Collectors.toList())));

        printMap(groupByYearThenByMajor);

    }

    private static <K, V> void printMap(Map<K, V> map) {
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("=======================================");
    }
}
