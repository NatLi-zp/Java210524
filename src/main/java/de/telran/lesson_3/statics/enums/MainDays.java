package de.telran.lesson_3.statics.enums;

public class MainDays {
    public static void main(String[] args) {

//        DayOfWeek day1 = new DayOfWeek("Воскресенье");
//        System.out.println(day1.title);
//
//        DayOfWeek day2 = new DayOfWeek("Gjjgjgfjgfjg");
//        System.out.println(day2.title);

        DayOfWeek day1 = DayOfWeek.MONDAY;
        System.out.println(day1);
        DayOfWeek day2 = DayOfWeek.WEDNESDAY;
        System.out.println(day2);


        //Enums
        DayOfWeekEnum dayE1 = DayOfWeekEnum.SUNDAY;
        DayOfWeekEnum dayE2 = DayOfWeekEnum.SATURDAY;

        System.out.println(dayE1);
        System.out.println(dayE2);

        System.out.println(dayE2.getTitle());

        for (DayOfWeekEnum day : DayOfWeekEnum.values()) {
            System.out.println(day + " ordinal -> " + day.ordinal());
        }

        System.out.println(dayE1.ordinal());

        System.out.println("--------- valueOf()---------");
        dayE1 = DayOfWeekEnum.MONDAY;
        System.out.println(dayE1);
        dayE2 = DayOfWeekEnum.valueOf("MONDAY"); // аналог DayOfWeekEnum.MONDAY (когда выбрали явно)
        System.out.println(dayE2);

       // dayE2 = DayOfWeekEnum.valueOf("Monday"); // так нельзя, MONDAY строго большими буквами
        dayE2 = DayOfWeekEnum.valueOf("Monday".toUpperCase()); // так нельзя, MONDAY строго большими буквами
        System.out.println(dayE2);

//        switch (dayE2) {
//            DayOfWeekEnum.SUNDAY:
//            DayOfWeekEnum.SATURDAY:
//            System.out.println("Выходной");
//            break;
//            default:
//                System.out.println("Раб. день");
//        }

    }
}
