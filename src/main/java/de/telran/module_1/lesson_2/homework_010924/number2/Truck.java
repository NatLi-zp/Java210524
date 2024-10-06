package de.telran.module_1.lesson_2.homework_010924.number2;

public class Truck extends Auto {
    int countCargo;

    public Truck(String name, int year, int countCargo) {
        super(name, year);
        this.countCargo = countCargo;
    }

    @Override
    public void TransportationСargoes(){
        System.out.println("Грузовик " + name + " (" + year + " год выпуска) может перевозить "+countCargo +" тонн груза" );
    }
}

