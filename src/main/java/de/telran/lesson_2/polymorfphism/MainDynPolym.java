package de.telran.lesson_2.polymorfphism;

public class MainDynPolym {
    public static void main(String[] args) {

        // динамич полиморфизм на примере переопределения методов
        // динамич полиморфизм при раб с предком
        Dance dance = new Dance("Вася", 15);
        dance.dance();

        HipHopDance hipHopDance = new HipHopDance("Петя", 18);
        hipHopDance.dance();

        BreakDance breakDance = new BreakDance("Гриша", 19);
        breakDance.dance();

        Dance dance1 = new HipHopDance("Леонид", 20);
        dance1.dance();

        dance1 = breakDance;
        dance1.dance();

        //hipHopDance = breakDance; // нельзя,можно только предку присваивать

        Dance[] progr1 = {dance, hipHopDance, breakDance};
        koncert(progr1);


        ///Абстрактный класс Singer - динамич полиморфизм
        //Singer singer = new Singer("Даша"); // не могу создать объект вбсирак. класса

        System.out.println();
        Singer singer1 = new PopSinger("Маша");
        singer1.sing();

        singer1 = new RockSinger("Далила");
        singer1.sing();

        //интерфейс Playable
     //   Playable playable = new Playable(); // не могу создать оюъект интерфейса

        System.out.println();

        //Сужение функционала до поведения, который представлен в интерфейсе
        Playable playable = new ReperPlay("Мирон");
        playable.play();
        playable.speak();

        ReperPlay reperPlay = new ReperPlay("Лимон");
        reperPlay.play();
        reperPlay.speak();
        reperPlay.dance();
    }

    static void koncert(Dance[] arr) {
        System.out.println("-----Начинаем наш концерт------");
        for (Dance dance : arr)
            dance.dance();
    }
}
