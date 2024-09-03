package de.telran.lesson_3.statics;

public class MainAuto {
    public static void main(String[] args) {

        System.out.println(Auto.countAutos);
        Auto.printCountAutos();  // неявно Auto.printCountAutos(null);

        Auto auto1 = new Auto("BMW");
        //  System.out.println(auto1.name);
        System.out.println(auto1.getName());
        auto1.setMileAge(100); //неявно Auto.setMileAge(auto1,100);  this = auto1
        System.out.println("Пробег - "+auto1.getMileAge());

        System.out.println(Auto.countAutos);
        Auto auto2 = new Auto("VW");
        System.out.println(auto2.name);

        System.out.println(auto2.getCountAutos()); // получаем доступ к static чз объект класса
        System.out.println(Auto.countAutos);

        // Math - пример класса утилиты
        System.out.println(Math.abs(-33));
        //Math math = new Math() // Нельзя , т.к. конструктор private

        System.out.println();
    }
}
