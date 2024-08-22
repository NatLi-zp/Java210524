package de.telran.lesson_2;

public class UnicornExt extends Horse{
    int countHorn; //кво рогов

    public UnicornExt(String name, String color, int weight, int countHorn) {
        super(name, color, weight);
        this.countHorn = countHorn;
    }

    public void butt(){ //умение драться
        System.out.println(name +" при защите бодается " + countHorn+ " рогом/ами");

    }
}
