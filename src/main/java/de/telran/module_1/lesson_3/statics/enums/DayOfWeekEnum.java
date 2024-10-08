package de.telran.module_1.lesson_3.statics.enums;

public enum DayOfWeekEnum {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY("Суббота"),
    SUNDAY;

    private String title;

    private DayOfWeekEnum() {
    }

    private DayOfWeekEnum(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }
}

