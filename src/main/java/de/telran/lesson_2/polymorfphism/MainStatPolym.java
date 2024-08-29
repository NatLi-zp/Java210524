package de.telran.lesson_2.polymorfphism;

public class MainStatPolym {

    static int add(int v1, int v2) {
        System.out.println("Выполняется int v1, int v2");
        return v1 + v2;
    }

    // не сравнивает имена переменных, не работает,дублирует предыд. метод
//    static int add(int v2, int v1) {
//        System.out.println("Выполняется int v1, int v2");
//        return v1 + v2;
//    }

    // компилятор воспринимает этот метод как дубликат, тк он не проверяет тип возвращ. значения
//    static double add(int v1, int v2) {
//        System.out.println("Выполняется int v1, int v2");
//        return v1 + v2;
//    }

    static double add(double v1, double v2) {
        System.out.println("Выполняется double v1, double v2");
        return v1 + v2;
    }

    static double add(double v1, int v2) {
        System.out.println("Выполняется double v1, int v2");
        return v1 + v2;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 8));
        System.out.println(add(1.0, 3.5));
        System.out.println(add(1, 3.5));

        System.out.println(add(1L, 3.5F));
        System.out.println(add(3.5F, 1));
    }
}
