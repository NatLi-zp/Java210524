package de.telran.module_2.lesson_9.homework_170924;

import de.telran.module_2.lesson_9.Fly;
import de.telran.module_2.lesson_9.SortFlyByName;
import de.telran.practice_160924.Student;

import java.util.*;

public class MainHouse {
    public static void main(String[] args) {
        House house1 = new House(100, 15_000, "Berlin", true);
        House house2 = new House(200, 100_000, "Berlin", false);
        House house3 = new House(50, 50_000, "Hamburg", false);
        House house4 = new House(50, 7000, "Köln", true);
        House house5 = new House(70, 10_000, "Hamburg", true);
        House house6 = new House(500, 100, "Berlin", true);
        House house7 = new House(150, 60, "Berlin", false);

        Set<House> houseSetL1 = new LinkedHashSet<>();
        houseSetL1.add(house1);
        houseSetL1.add(house2);
        houseSetL1.add(house3);
        houseSetL1.add(house4);
        houseSetL1.add(house5);
        houseSetL1.add(house6);
        houseSetL1.add(house7);
        System.out.println("Полная база данных : " + houseSetL1);

        System.out.println();
        Set<House> houseSetT1 = new TreeSet<>();
        houseSetT1.addAll(houseSetL1);
        System.out.println("Дома сортируются по цене ( по умолч.): " + houseSetT1); // но без дублей

        System.out.println();
        List<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        houseList.add(house4);
        houseList.add(house5);
        houseList.add(house6);
        houseList.add(house7);

        Comparator<House> houseComparatorByCityPrice = new SortHouseByCityPrice();
        houseList.sort(houseComparatorByCityPrice); // отсортир по городу и цене
        System.out.println("Sort по городу и цене  Comparator " + houseList);

        System.out.println();
        Comparator<House> houseComparatorByCityArea = new SortHouseByCityArea();
        houseList.sort(houseComparatorByCityArea); // отсортир по городу и площади
        System.out.println("Sort по городу и площади  Comparator " + houseList);
    }
}
