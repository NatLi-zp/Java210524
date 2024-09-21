package de.telran.module_2.lesson_9.homework_170924;

import de.telran.module_2.lesson_9.Fly;
import de.telran.module_2.lesson_9.SortFlyByName;
import de.telran.practice_160924.Student;

import java.util.*;

public class MainHouse {
    public static void main(String[] args) {
        House house1 = new House(100, 10_000, "Berlin", true);
        House house2 = new House(200, 100_000, "Berlin", false);
        House house3 = new House(50, 50_000, "Hamburg", false);
        House house4 = new House(50, 7000, "Köln", true);
        House house5 = new House(70, 10_000, "Hamburg", true);
        House house6 = new House(100, 100, "Berlin", true);
        House house7 = new House(200, 60, "Berlin", false);

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
//        Set<House> houseSetT1 = new HashSet<>();
//        houseSetT1.add(house1);
//        houseSetT1.add(house2);
//        houseSetT1.add(house3);
//        houseSetT1.add(house4);
//        houseSetT1.add(house5);
//        houseSetT1.add(house6);
//        houseSetT1.add(house7);
        System.out.println("Дома сортируются по цене ( по умолч.): " + houseSetT1);

        System.out.println();
        List<House> list = new ArrayList<>();
        list.add(house1);
        list.add(house2);
        list.add(house3);
        list.add(house4);
        list.add(house5);
        list.add(house6);
        list.add(house7);
        System.out.println(list);

        String keyCity = "Berlin";
        System.out.println();
        System.out.println("-----------------Отбор по городу  " + keyCity + ": ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).city == keyCity)
                System.out.println(list.get(i));
        }

//        Comparator<House> houseComparatorByCity = new SortHouseByCity();
//        list.sort(houseComparatorByCity); // отсортир по городу
//        System.out.println("Sort по городу = " + list);


//        String cityKey = "Berlin";
//        Set<House> houseSetL2 = new LinkedHashSet<>();
        //  houseSetL2.addAll(houseSetL1);

//        for (int i = 0; i < houseSetL1.size(); i++) {
//            System.out.println(houseSetL1.(i));
//        }
//            if (houseSetL1.ge)
//            System.out.println();
//        }


//        Set<House> houseSetT2 = new TreeSet<>();
//        houseSetT2.add(house1);
//        houseSetT2.add(house2);
//        houseSetT2.add(house3);
//        houseSetT2.add(house4);
//        houseSetT2.add(house5);

        //  System.out.println("Отбор по городу " + cityKey + ": " + houseSetL2);


    }


}
