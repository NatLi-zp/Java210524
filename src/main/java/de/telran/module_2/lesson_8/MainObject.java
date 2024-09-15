package de.telran.module_2.lesson_8;

public class MainObject {
    public static void main(String[] args) {

        Object obj = new Object();

        String str1 = "DB";
        String str2 = "Ca";

        // коллизия алгоритма
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // коллизии по числу int
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);

        // Работаем с нашим обїектом
        Auto auto1 = new Auto("11111", "BMW", 4);
        Auto auto2 = new Auto("11111", "BMW", 4);
        Auto auto3 = new Auto("11111", "BMW", 2);

        System.out.println(auto1 == auto2);
        System.out.println(auto1.equals(auto2));
        System.out.println(auto1.equals(auto3));

        System.out.println(auto1.getClass());
        System.out.println(auto2.getClass());
        System.out.println(auto3.getClass());

        Vehicle vehicle1 = new Auto();
        System.out.println(vehicle1.getClass());

        Vehicle vehicle2 = new Vehicle();
        System.out.println(vehicle2.getClass());
        System.out.println(vehicle1.equals(vehicle2));

        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());

        System.out.println("auto1 = " + auto1.hashCode());
        System.out.println("auto2 = " + auto2.hashCode());
    }
    }

