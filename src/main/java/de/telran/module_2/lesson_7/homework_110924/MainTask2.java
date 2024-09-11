package de.telran.module_2.lesson_7.homework_110924;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainTask2 {
    public static void main(String[] args) {
        int talon = 5;
//        Random random = new Random();
//        Set<Integer> setL = new LinkedHashSet<>();
//        final int SIZE_SET = 5;
//        for (int i = 0; i < SIZE_SET; i++) {
//            setL.add(random.nextInt(10) + 1);
//        }

        Set<Integer> setL = new LinkedHashSet<>();
        setL.add(4);
        setL.add(6);
        setL.add(8);
        setL.add(1);
        setL.add(9);
        setL.add(2);
        setL.add(7);
        setL.add(3);
        System.out.println("LinkedHashSet = " + setL);
        System.out.println("Талон №" + talon);
        setL.add(talon);
        System.out.println("LinkedHashSet (строго по живой очереди) = " + setL);

    }
}
