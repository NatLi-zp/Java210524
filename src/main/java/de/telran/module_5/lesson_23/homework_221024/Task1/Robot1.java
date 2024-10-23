package de.telran.module_5.lesson_23.homework_221024.Task1;

public class Robot1 implements Runnable{

    private int count;
    private Table table;

    public Robot1(int count, Table table) {
        this.count = count;
        this.table = table;
    }

    public Robot1(Table table) {
        this.table = table;
    }

    public void run(){
        for (int i = 1; i <= this.count; i++) {
            table.put();
        }
    }
}
