package de.telran.lesson_2.homework_010924.number1;

public class Door {
    String color;
    String property;
    String material;

    public Door(String color, String property, String material) {
        this.color = color;
        this.property = property;
        this.material = material;
    }

    public String getDoor() {
        return "(цвет: " + color + ", св-во: " + property + ", материал: " + material + ")";
    }
}

