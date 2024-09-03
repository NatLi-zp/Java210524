package de.telran.lesson_3.statics;

public class Auto {
    public static final int COUNT_WHEELS = 4; // константа принадлежит классу
    public final int WIN_CODE = 12345; // константа принадлежит объекту

    String name;
    static int countAutos = 1;
    private int mileAge;

    {
        if (name == null)
            mileAge = 1;

        //WIN_CODE = 12345;   можно
    }

    static { // при запуске программы
        countAutos =2;
        printCountAutos();
    }

    public Auto(String name) {
        this.name = name;
        //  Auto.countAutos++;
        addAuto();

        //WIN_CODE = 12345;   можно
    }

    public int getCountAutos() {
        return countAutos;
    }

    public static int addAuto() {
        return ++countAutos;
    }

    public static void printCountAutos() {
        // скрыто this = null;
        System.out.println("кол-во авто=" + countAutos);
    }

    public String getName() {
        return name + " имеет колес " + COUNT_WHEELS + " винкод  -"+ WIN_CODE;
    }

    public void setMileAge(int mileAge) {
        if (mileAge >= 0)
            this.mileAge = mileAge;
    }

    public int getMileAge() {
        return mileAge;
    }
}
