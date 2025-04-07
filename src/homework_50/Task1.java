package homework_50;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


/*
Task1 (на уроке)
 */

public class Task1 {

    public static void main(String[] args) {

        // "15-12-2022 20-46"
        // запарсить строку в формат LocalDateTime
        // распечатать отдельно месяц, день, час

        String dateStr1 = "15-12-2022 20-46";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime date1 = LocalDateTime.parse(dateStr1, formatter2);
        System.out.println("date1: " + date1);
        System.out.println("месяц: " + date1.getMonth());
        System.out.println("день: " + date1.getDayOfMonth());
        System.out.println("год: " + date1.getYear());

        System.out.println("========================");
        // 13-01-2023 00-47
        // Какому дню недели соотвествует вторая дата
        // сколько дней между этими датами?

        String dateStr2 = "13-01-2023 00-47";
        LocalDateTime date2 = LocalDateTime.parse(dateStr2, formatter2);
        System.out.println("date2: " + date2);
        System.out.println("день недели: " + date2.getDayOfWeek());
        // вариант 1
        System.out.println("кол-во дней между датами: " + ChronoUnit.DAYS.between(date1, date2));
        // вариант 2
        System.out.println("кол-во дней между датами: " + date1.until(date2, ChronoUnit.DAYS));
    }
}
