package de.telran.module_4.lesson_19.homework_131024;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.time.Period;

public class MainLocalDateTask1 {
    public static void main(String[] args) {

        //1) реализовать метод, который принимает год и проверяет на высокосность
        GregorianCalendar calendar = new GregorianCalendar();
        int year = 2024;
        System.out.println("1. Год высокосный: " + year + " = " + calendar.isLeapYear(year));

        //2) вывести на консоль дату локализованную для Индии (например)
        Locale locale = new Locale("hi"); //индийская локализация //de, ru, en
        Locale.setDefault(locale);
        Date now = new Date();
        String date = String.format(locale, "%tc", now);
        System.out.println("2. Текущая дата (Индия): " + date);
        locale = new Locale("ru"); //индийская локализация //de, ru, en
        Locale.setDefault(locale);

        //3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy, dd, DD, kk:mm");
        String dateStr = simpleDateFormat.format(new Date());
        System.out.println("3. Текущая дата (<дата, день месяца, день в году, время>): " + dateStr);

        //4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        calendar = new GregorianCalendar(1985, Calendar.JANUARY, 10);
        System.out.println("4. Дата в формате 10 Января 1985: " + dateFormat.format(calendar.getTime()));

        // 5) проверить дата "10 Января 1985" - это пятница, попробуйте получить день недели для любой другой даты?
        LocalDate date1 = LocalDate.of(1985, 1, 10);
        int dayOfMonth = date1.getDayOfMonth();// номер дня в неделе
        DayOfWeek dayOfWeek = date1.getDayOfWeek(); // день недели как элемент перечисления
        System.out.println("5. День недели для даты : " + date1 + " = " + dayOfWeek);

        date1 = LocalDate.now();
        dayOfMonth = date1.getDayOfMonth();// номер дня в неделе
        dayOfWeek = date1.getDayOfWeek(); // день недели как элемент перечисления
        System.out.println("5. День недели для даты : " + date1 + " = " + dayOfWeek);

        //6) вычесть 10 лет из созданной даты, вывести на консоль
        date1 = LocalDate.of(1985, 1, 10);
        System.out.println("6. Минус 10 лет от даты : " + date1 + " = " + date1.minusYears(10));
        date1 = LocalDate.now(); // текущая дата
        System.out.println("6. Минус 10 лет от даты : " + date1 + " = " + date1.minusYears(10));

        //7) получить ZonedDateTime из "Pacific/Midway", вывести на консоль
        ZoneId zoneId = ZoneId.of("Pacific/Midway");
        ZonedDateTime zoneDateTime = ZonedDateTime.now(zoneId);
        System.out.println("7. ZonedDateTime из Pacific/Midway : " + zoneDateTime);

        //8)* получить возраст человека на текущий момент, если известна его дата рождения.
        LocalDate dateBirthday = LocalDate.of(1985, 1, 10);
        LocalDateTime now1 = LocalDateTime.now(); //
        long yearsOld = ChronoUnit.YEARS.between(dateBirthday, now1);
        System.out.println("8. День рождения: " + dateBirthday + ". Возраст : " + yearsOld + " лет");

        //9)* Вы просыпаетесь и смотрите на будильник. Вам на работу нужно на 9 часов. Узнайте, сколько времени
        //осталось еще до начала работы или если вы проспали, то на сколько.
        LocalTime time1 = LocalTime.now(); // текущее время
        LocalTime time2 = LocalTime.of(9, 0); // время на работу

        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        if (minutes < 0)
            System.out.println("9. На работу в 9ч. Вы проспали " + -minutes + " минут");
        else
            System.out.println("9. На работу в 9ч. До работы еще  " + minutes + " минут");


    }
}
