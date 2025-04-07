package lesson_50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimeApi {

    // Java Time Api / пакет java.time

    /*
    util.Date
    util.Calendar
    text.SimpleDateFormat

    Joda-Time - сторонняя библиотека (легла в основу Java Time)
     */


    public static void main(String[] args) {
    /*
         класс LocalDate - представляет дату (год, месяц, день) без времени
         LocalDate.now(); -  возвращает текущую дату
         дата, как и строка иммутабельна (неизменна) !

         plusDays(long days) - прибавить дни
         plusWeeks(long days) - прибавить недели
         plusMonths(long days) - прибавить месяца

         minusDays(long days) -отнять дни
         minusWeeks(long days) - отнять недели
         minusMonths(long days) - отнять месяца

          LocalDate.of(year, month, day) - установить дату (год, месяц, число)
          getYear() - получить год
          getMonth() - месяц Enum
          getMonthValue() - месяц-цифра
          getDayOfMonth() -
          getDayOfWeek() - день недели
          getDayOfYear() - день-года
          lengthOfMonth() - сколько дней в месяце
          lengthOfYear() - сколько дней в году
          isLeapYear() - високосный ли год

          парсинг - получение из строки объекта - даты
    */

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("date: " + date);

        // Прибавить 1 день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeeks:" + date.plusWeeks(4));
        System.out.println("minusMonths:" + date.minusMonths(2));

        LocalDate date1 = LocalDate.of(2002, 2, 15); // Установить дату (год, месяц, число)

        // Можно использовать Enum, с названием месяца
        date1 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date1: " + date1);

        System.out.println("год: " + date.getYear() + "; месяц: " + date.getMonth() + "; месяц-цифра: " + date.getMonthValue());
        System.out.println("число: " + date.getDayOfMonth() + "; день недели: "
                + date.getDayOfWeek() + "; день-года: " + date.getDayOfYear());
        System.out.println("сколько дней в месяце: " + date.lengthOfMonth()
                + "; дней в году: " + date.lengthOfYear() +
                "; был ли год високосным : " + date.isLeapYear());


        // Преобразование строки в объект даты
        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println(date2.getDayOfMonth() + "/" + date2.getMonthValue() + "/" + date2.getYear());


        System.out.println("================LocalTime=================");
    /*
         класс LocalTime - представляет время (часы, минуты, секунды, наносекунды)

         LocalTime.now() - возвращает текущее время
         LocalTime.of(hour, minute, second) - устанавливает часы, минуты, секунды
         plusHours() - добавить часы к времени
         plusMinutes() - прибавить минуты
         minusSeconds() - отнять секунды
         getHour() - получить часы
         getMinute()  - получить минуты
         getSecond()  - получить секунды
         getNano() - получить наносекунды

         parse("hour:minute:second") - из строки в объект времени, ТОЛЬКО в формате hour:minute:second через : !!!

    */

        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("time: " + time);

        LocalTime time1 = LocalTime.of(21, 33); // часы + минуты
        time1 = LocalTime.of(21, 33, 44);
        time1 = LocalTime.of(21, 33, 44, 54875);

        System.out.println("time1: " + time1);

        LocalTime time2 = time.plusHours(1); // добавляет 1 час к объекту времени
        System.out.println("time.plusHours(1): " + time2);
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | "
                + time.getSecond() + " | " + time.getNano());

        String timeString = "12:13:45";   // "12-13-45" - ОШИБКА !!
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime);


        System.out.println("================LocalDateTime=================");
    /*
         класс LocalDateTime - представляет дату и время без учета часового пояса
         now() - текущая дата-время

     */
        LocalDateTime now = LocalDateTime.now(); // текущая дата-время
        System.out.println("now: " + now);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 22, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);

        dateTime = LocalDateTime.of(2025, 12, 31, 23, 59);
        System.out.println(dateTime.getDayOfWeek().getValue());
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));


        System.out.println("================ZonedDateTime=================");
    /*
         класс ZonedDateTime - представляет дату и время с часовым поясом
         now() - текущая дата-время
         getZone() - получить зону
     */

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());
        // часовой пояс - по времени сервера


        System.out.println("=====isAfter, isBefore, until, equals=======");
     /*
        isAfter, isBefore, until, equals - есть у всех объектов, представляющих дату и/или время

         boolean isAfter - проверяет, что текущий объект после (позже) указанного в параметре метода объекта
         boolean isBefore- проверяет, что текущий объект до (раньше) указанного в параметре метода объекта
         equals - проверяет даты/время на равенство

         long until - метод измеряет время между текущим и указанным объектом даты/времени, при этом в параметрах
                      указывается единица времени (ChronoUnit), в которой вывести результат

         plus (сколько, ChronoUnit) - прибавить единицы времени
         minus (сколько, ChronoUnit) - отнять единицы времени

         long ChronoUnit.between() - собственный метод ChronoUnit-а
     */

        LocalDate date3 = LocalDate.of(2020, 10, 16);
        LocalDate date4 = LocalDate.of(2020, 6, 25);

        boolean isAfter = date3.isAfter(date4);
        System.out.println("date3.isAfter(date4): " + isAfter);
        System.out.println("date3.isBefore(date4): " + date3.isBefore(date4));

        System.out.println("date3.equals(date4): " + date3.equals(date4));

        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("between: " + between);


        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println("until days: " + dateTime2.until(dateTime1, ChronoUnit.DAYS));
        System.out.println("until seconds: " + dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.plus(10, ChronoUnit.DAYS);
        System.out.println("dateTime1.plus(10, ChronoUnit.DAYS): " + dateTime3);

        dateTime3 = dateTime1.minus(10, ChronoUnit.MINUTES);
        System.out.println("dateTime1.plus(10, ChronoUnit.MINUTES): " + dateTime3);

        // метод ChronoUnit -. between() -> long

        long hourBetween = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        System.out.println("hourBetween: " + hourBetween);


        System.out.println("=====Instant, Duration, Period =======");
     /*
        класс Instant - представляет собой точку на временной шкале в Григорианском календаре с точностью до наносекунд
        Unix epoch (Epoch time) - Эпоха юникс / эпоха началась с 1 января 1970 года

        Момент времени, он основан на количестве секунд и наносекунд, прошедших с 01.01.1970
     */

        Instant nowIstant = Instant.now();
        long millis = nowIstant.toEpochMilli(); // количество миллисекунд с 1970-01-01
        System.out.println("nowIstant.toEpochMilli(): " + millis);

        Instant instant = Instant.ofEpochMilli(millis); // получить из миллисекунд объект инстанта
        System.out.println(instant);


    /*
        Duration, Period - представляют собой отрезки времени (временные интервалы), но используются
                            для разных типов временных единиц

        Duration - продолжительность в секундах и наносекундах
        Period - разница (продолжительность) в днях, месяцах, годах
    */
        // TODO (самостоятельно)


        System.out.println("============= DateTimeFormatter ==============");

    /*
        DateTimeFormatter - форматирование даты и времени

        y - год
        M - месяц
        d - день
        H - час в формате от 0 до 23
        h - час в формате от 0 до 12, флаг 'a' для отображения AM/PM
        m - минута
        s - секунда

        Количество повторений символа определяет формат отображения значения
        yyyy - 4-х значный год
        yy - 2-х значный год, например `23` для 2023 года

        M - месяц в сыром формате -> "2", "12"
        MM - месяц в 2-х значном формате -> "02", "12"

        d - сырой номер дня -> "3", "29"
        dd - двузначный день -> "03", "29"

    */

        LocalDateTime nowLDT = LocalDateTime.now();
        System.out.println("nowLDT: " + nowLDT);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a");
        String formattedString = nowLDT.format(formatter);
        System.out.println("formattedString: " + formattedString);


        // Есть строка с датой - создать объект LDT соответствующей этой дате
        String dateForParse = "23-10-26 19:15";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateForParse, formatter1);
        System.out.println("parseDate: " + parseDate);
        System.out.println(parseDate.getDayOfWeek() + " | " + parseDate.getHour());


        System.out.println("================= Task1 ===================");
        // "15-12-2022 20-46"
        // запарсить строку в формат LocalDateTime
        // распечатать отдельно месяц, день, час


        String dateStr1 = "15-12-2022 20-46";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime myDate1 = LocalDateTime.parse(dateStr1, formatter2);
        System.out.println("myDate: " + myDate1);
        System.out.println(myDate1.getMonth());
        System.out.println(myDate1.getDayOfMonth());
        System.out.println(myDate1.getHour());


        // 13-01-2023 00-47
        // Какому дню недели соотвествует вторая дата
        // сколько дней между этими датами?

        String dateStr2 = "13-01-2023 00-47";
        LocalDateTime myDate2 = LocalDateTime.parse(dateStr2, formatter2);
        System.out.println(myDate2.getDayOfWeek());
        System.out.println(ChronoUnit.DAYS.between(myDate1,myDate2));


    }
}
