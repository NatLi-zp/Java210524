package de.telran.module_2.lesson_10.homework_180924.Task3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainAutoPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Auto> autos = new PriorityQueue<>();
        autos.offer(new Auto("Honda", AutoType.CAR, false, false, 1));
        autos.offer(new Auto("Mercedes", AutoType.AMBULANCE, false, false, 2));
        autos.offer(new Auto("Liebherr", AutoType.SPECIAL_TRANSPORT, false, false, 3));
        autos.offer(new Auto("VW", AutoType.CAR, false, false, 4));
        autos.offer(new Auto("Cat", AutoType.SPECIAL_TRANSPORT, false, true,5));
        autos.offer(new Auto("Icarus", AutoType.BUS, true, false,6));
        autos.offer(new Auto("Mercedes11", AutoType.AMBULANCE, false, false,7));

        autos.offer(new Auto("VW1", AutoType.CAR, false, true,8));
        autos.offer(new Auto("VW2", AutoType.CAR, false, false,9));
        autos.offer(new Auto("VW3", AutoType.CAR, false, false,10));


        //   autos.offer(new AutoTask3("Mercedes"));

        System.out.println("Автозаправка Queue: " + autos);

        System.out.println("Обслуживание авто  (poll) :");
        while (!autos.isEmpty()) {
            System.out.println(autos.poll());
        }
    }
}
