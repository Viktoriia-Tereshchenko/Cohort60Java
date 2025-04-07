package homework_50;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
Task 2
Получить и вывести на экран:
    текущую дату
    текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
    текущее время
    текущее время + 3 часа
Создать дату:
    которая на неделю позже сегодняшней
    которая была на год раньше сегодняшней используя метод minus
    которая на год позже сегодняшней
    tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class Task2 {
    public static void main(String[] args) {

        //текущая дата
        LocalDate today = LocalDate.now();
        System.out.println("сегодня: " + today);

        // текущий год, месяц и день
        System.out.println("текущий год: " + today.getYear()
                + ", месяц: " + today.getMonthValue() + " (" + today.getMonth() + ")"
                + ", день: " + today.getDayOfMonth());
        System.out.println("=============================");

        // день рождения
        LocalDate birthday = LocalDate.of(1990, 5, 9);
        System.out.println("мой день рождения: " + birthday);
        System.out.println("=============================");

        // Создать две даты и проверить на равенство
        LocalDate date1 = LocalDate.of(2025, 2, 20);
        LocalDate date2 = LocalDate.of(2025, 2, 2);
        System.out.printf("даты %tF и %tF равны?  %b\n", date1, date2, date1.equals(date2));
        System.out.println("=============================");

        //текущее время
        //текущее время + 3 часа
        LocalTime currentTime = LocalTime.now();
        System.out.println("текущее время: " + currentTime);
        System.out.println("текущее время + 3 часа: " + currentTime.plusHours(3));
        System.out.println("=============================");


        // Создать дату, которая на неделю позже сегодняшней
        LocalDate date3 = today.plusWeeks(1);
        System.out.println("дата через неделю: " + date3);
        // вариант 2
        System.out.println("дата через неделю: " + today.plusDays(7));
        // вариант 3
        System.out.println("дата через неделю: " + today.plus(1, ChronoUnit.WEEKS));
        System.out.println("=============================");

        // дата, которая была на год раньше сегодняшней используя метод minus
        LocalDate date4 = today.minus(1, ChronoUnit.YEARS);
        System.out.println("дата год назад: " + date4);

        // дата, которая на год позже сегодняшней
        date4 = today.plus(1, ChronoUnit.YEARS);
        System.out.println("дата через год : " + date4);
        // вариант 2
        System.out.println("дата через год : " + today.plusYears(1));
        System.out.println("=============================");

        // Создать tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("tomorrow находятся после today: " + tomorrow.isAfter(today));
        System.out.println("yesterday находятся до today: " + yesterday.isBefore(today));
    }
}
