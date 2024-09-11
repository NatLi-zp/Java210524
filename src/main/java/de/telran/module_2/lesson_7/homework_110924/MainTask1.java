package de.telran.module_2.lesson_7.homework_110924;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainTask1 {
    public static void main(String[] args) {
        int talon = 5;

 //       Set<Integer> setT = new TreeSet<>();
//        Random random = new Random();
//        final int SIZE_SET = 5;
//        for (int i = 0; i < SIZE_SET; i++) {
//            setT.add(random.nextInt(10) + 1);
//        }

        Set<Integer> setT = new TreeSet<>(Set.of(4, 6, 8, 1, 9, 2, 7, 3));
        System.out.println("TreeSet = " + setT);
        System.out.println("Талон №" + talon);
        setT.add(talon);
        System.out.println("TreeSet (строго по номеру в порядке возрастания) = " + setT);

    }
}
