package homework_50;

/*

Task 3
Написать метод, принимающий список из нескольких дат типа LocalDate
и возвращающий количество дней между самой ранней и поздней датами в этом списке

 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Task3 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        List<LocalDate> dates = new ArrayList<>(List.of(
                today,
                today.plusDays(13),
                today.plusDays(56),
                today.minusDays(453),
                today.minusWeeks(11),
                today.plusYears(1),
                today.minusMonths(4)
        ));
        dates.add(null);

        List<LocalDate> datesEmpty = new ArrayList<>();
        List<LocalDate> datesOnlyNull = new ArrayList<>();
        datesOnlyNull.add(null);
        datesOnlyNull.add(null);

        try {
            System.out.println(daysBetweenMinAndMaxDates(dates));
            // System.out.println(daysBetweenMinAndMaxDates(datesEmpty));
            // System.out.println(daysBetweenMinAndMaxDates(datesOnlyNull));
            // System.out.println(daysBetweenMinAndMaxDates(null));
        } catch (DateException e) {
            System.out.println("Ошибка при работе с датой: " + e.getMessage());
        }
    }


    public static long daysBetweenMinAndMaxDates(List<LocalDate> dates) throws DateException {

        if (dates == null || dates.isEmpty()) throw new DateException("Список дат не может быть пустым!");

        Optional<LocalDate> minDate = dates.stream()
                .filter(Objects::nonNull)
                .min(LocalDate::compareTo);

        Optional<LocalDate> maxDate = dates.stream()
                .filter(Objects::nonNull)
                .max(LocalDate::compareTo);

        if (minDate.isEmpty()) throw new DateException("Не найдена минимальная дата!");
        if (maxDate.isEmpty()) throw new DateException("Не найдена максимальная дата!");

        return ChronoUnit.DAYS.between(minDate.get(), maxDate.get());
    }
}
