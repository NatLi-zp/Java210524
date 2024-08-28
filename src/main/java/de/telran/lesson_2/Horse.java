package de.telran.lesson_2;

public class Horse {
    public String name;
    protected String color;// доступен потомкам(и в др.пакете)
    int weight; //кол-во груза
    private int countTooths; // не наследуется потмоками

    static int count; // общее кол-во произведенных лошадей

    public Horse() {
        count++;
    }

    public Horse(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        count++;
    }

    public Horse(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public void run() {
        System.out.println("Бежит лошадь " + name + " цвет " + color+" кол-во зубов "+countTooths);
    }

    public void transports() {
        System.out.println("Лошадь " + name + " везет груз весом " + weight);
    }

private void addTooth(int count){
    System.out.println("Лошадь " + name + " имел зубов " + countTooths);
    countTooths += count;
    System.out.println("Лошадь " + name + " после вставки уже имеет зубов " + countTooths);
}
}
