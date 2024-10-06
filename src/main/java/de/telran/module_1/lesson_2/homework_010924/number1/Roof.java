package de.telran.module_1.lesson_2.homework_010924.number1;

public class Roof {
    String color;
    String property;

    public Roof(String color, String property) {
        this.color = color;
        this.property = property;
    }

    public String getRoof(){
        return "(цвет: " + color + ", св-во: " + property + ")";
    }
}
