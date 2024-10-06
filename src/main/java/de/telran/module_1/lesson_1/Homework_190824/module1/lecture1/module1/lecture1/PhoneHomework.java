package de.telran.module_1.lesson_1.Homework_190824.module1.lecture1.module1.lecture1;

public class PhoneHomework {
    String number;
    String model;
    int weight;

    public PhoneHomework(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

        public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    public String getNumber() {
        return number;
    }
}
