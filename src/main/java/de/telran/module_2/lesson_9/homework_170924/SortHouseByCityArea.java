package de.telran.module_2.lesson_9.homework_170924;

import java.util.Comparator;

public class SortHouseByCityArea implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        if (o1.getCity().charAt(0) > o2.getCity().charAt(0))
            return 1;
        else if (o1.getCity().charAt(0) < o2.getCity().charAt(0))
            return -1;
        else {
            if (o1.area > o2.area) return 1;
            else if (o1.area < o2.area) return -1;
            else return 0;
        }
    }
}
