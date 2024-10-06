package de.telran.module_1.lesson_2.homework_270824;

public interface Repair {

    default void repair() {
        System.out.println("Траспортное средство пригодно для ремонта");
    } //ремонтировать
}
