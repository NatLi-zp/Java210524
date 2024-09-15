package de.telran.module_2.lesson_8;

import java.util.Objects;

public class Auto extends Vehicle{
    private String id; // самый уникальный идентиф.
    private String number;
    private String name;
    private int countDoors;

    public Auto() {
    }

    public Auto(String number, String name, int countDoors) {
        this.number = number;
        this.name = name;
        this.countDoors = countDoors;
    }

    public Auto(String id, String number, String name, int countDoors) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.countDoors = countDoors;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(int countDoors) {
        this.countDoors = countDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return countDoors == auto.countDoors && Objects.equals(number, auto.number) && Objects.equals(name, auto.name);
        //return Objects.equals(id, auto.id)
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Auto auto)) return false;
//        return countDoors == auto.countDoors && Objects.equals(number, auto.number) && Objects.equals(name, auto.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, countDoors);
       // return Objects.hash(id);
    }
}
