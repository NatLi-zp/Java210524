package de.telran.module_1.lesson_3.homework_030924;

public enum MonthEnum {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private String title;

    private MonthEnum(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "месяц " + title;

    }

}
