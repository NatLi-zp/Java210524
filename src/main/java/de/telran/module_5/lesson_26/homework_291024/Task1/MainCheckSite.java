//1 уровень сложности: 1. У вас есть задача проверять какой то сайт, с целью проверки опубликования
//        на нем новой информации, но если мы будем слишком часто проверять этот сайт,
//        то нас могут "забанить" за спам. Чтобы избежать этого, вы должны слать свои запросы
//        не чаще чем один раз в минуту.
//        Ваша задача должна работать паралельно основной функциональности и не занимать ресурсы
//        главного потока.
//        Подумайте, какой механизм Java вы могли бы использовать для автоматизации данной задачи.
//        Как реализацию работы с сайтом, просто выведите сообщение о том, что соединение
//        установлено и выведите текущее время.

package de.telran.module_5.lesson_26.homework_291024.Task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainCheckSite {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1); //размер пула
       // executorService.scheduleAtFixedRate(new SheduleCheckSite(), 0, 1, TimeUnit.MINUTES); // повторять
        executorService.scheduleAtFixedRate(new ScheduleCheckSite(), 0, 5, TimeUnit.SECONDS); // по
    }
}
