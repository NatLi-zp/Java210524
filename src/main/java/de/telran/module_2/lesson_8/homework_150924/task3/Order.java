package de.telran.module_2.lesson_8.homework_150924.task3;

import java.util.ArrayList;

public class Order {
    ArrayList<String> dishesList;
    int numPlace;
    int numOrder;

    public Order(ArrayList<String> dishesList, int numPlace, int numOrder) {
        this.dishesList = dishesList;
        this.numPlace = numPlace;
        this.numOrder = numOrder;
    }

    @Override
    public String toString() {
        return  '\n'+"Заказ{" +
                "список блюд=" + dishesList +
                ", № столика=" + numPlace +
                ", № заказа=" + numOrder +
                '}' ;
    }
}
