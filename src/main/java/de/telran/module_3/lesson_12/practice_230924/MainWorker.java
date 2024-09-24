package de.telran.module_3.lesson_12.practice_230924;

import de.telran.module_3.lesson_12.MyOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MainWorker {
    public static void main(String[] args) {

        MyWorks myWorks1 = new MyWorks() {
            @Override
            public void work() {
                System.out.println("разгрузить шифер");
            }
        };

        Worker worker1 = new Worker("Oleg", 45, new ArrayList<>(List.of(
                () -> System.out.println("разгружает трубы"),
                () -> System.out.println("поднимает трубы"),
                myWorks1)

        ));

        worker1.myWorks.add(() -> System.out.println("красить стены"));
        for (MyWorks myWorks : worker1.myWorks) {
            myWorks.work();
        }

        System.out.println(worker1.myWorks.getLast());


        //============================================
        Consumer<String> job = (name) -> System.out.println("выполняю " + name);
        job.accept("принеси пиццу");

        BiConsumer<String, String> job1 = (name, nameJob) -> System.out.println(name + " выполняй :" + nameJob);
        job1.accept("Вася", "принеси кирпич");

        job1 = (name, nameJob) -> {
            if (name.equals("Вася")) {
                System.out.println(name + " выполняй :" + nameJob);
            } else {
                System.out.println("Не делай работу :" + nameJob);
            }

        };

        job1.accept("Вася","принеси чай");
        job1.accept("Катя","принеси чай");
    }


}
