package de.telran.module_5.lesson_26.homework_291024.Task1;

import java.util.Date;

public class ScheduleCheckSite implements Runnable{
    @Override
    public void run() {
        System.out.println("Cоединение установлено..."+new Date());
    }
}
