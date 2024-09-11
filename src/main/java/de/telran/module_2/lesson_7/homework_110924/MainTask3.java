package de.telran.module_2.lesson_7.homework_110924;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class MainTask3 {
    public static void main(String[] args) {

        Set<Integer> transports = new LinkedHashSet<>();
        transports.add(6);
        transports.add(5);
        transports.add(40);
        transports.add(8);
        transports.add(24);
        transports.add(61);
        transports.add(55);
        transports.add(10);

        System.out.println("Транспорт в туннеле = " + transports);
        transports.add(9);
        transports.add(11);
        transports.remove(6);
        transports.remove(5);
        transports.add(1);
        System.out.println("Транспорт в туннеле = " + transports);
        System.out.println("Количество транспорта в туннеле = " + transports.size());

    }
}
