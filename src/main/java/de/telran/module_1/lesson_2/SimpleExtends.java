package de.telran.module_1.lesson_2;

public class SimpleExtends {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.name = "Гриша";
        horse1.color = "гнедой";
        horse1.weight = 100;
        horse1.run();
        horse1.transports();

        Horse horse2 = new Horse("Вася", "белый", 50);
        horse2.run();
        horse2.transports();
        System.out.println();

        Horse horse3 = new Horse("Петя", "в яблоках");
        horse3.weight = 70;
        horse3.run();
        horse3.transports();
        System.out.println();

//        Pegasus pegasus1 = new Pegasus("Сема", "черный", 20, 2);
//        pegasus1.run();
//        pegasus1.transports();
//        pegasus1.fly();
//        System.out.println();

        PegasusExt pegasusExt = new PegasusExt("Пинки", "розовый", 10, 2);
        pegasusExt.fly();
        pegasusExt.run();
        pegasusExt.transports();
        System.out.println();

        UnicornExt unicornExt = new UnicornExt("Бур", "серый", 30, 1);
        unicornExt.run();
        unicornExt.transports();
        unicornExt.butt();
        System.out.println();

        UnicornRace unicornRace = new UnicornRace("Муся", "лиловый", 80, 2, 3);
        unicornRace.run();
        unicornRace.transports();
        unicornRace.butt();
        unicornRace.transportPassangers();
        System.out.println();

        System.out.println(+Horse.count+" общее кол -во лошадей");

        UniPegasus uniPegasus = new UniPegasus("Uni", "black", 10, 4, 1);
        uniPegasus.fly();
        uniPegasus.unicorn.butt();
    }
}
