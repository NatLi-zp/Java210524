package de.telran.module_1.lesson_2.abstraction;

public class LaserPrinter extends Printer {

    int countPrintPages; //кол-во листов, кот. он может напечатать на одной заправке

    public LaserPrinter(String name, String model, int year, int countPrintPages) {
        System.out.println("------Работает конструктор LaserPrinter::LaserPrinter()");
        super.name = name;
        super.model = model;
        super.year = year; //хотя переменная обїявлена в предке, но она уже уснаследована потомком. Поєтому мож. использ. this
        this.countPrintPages = countPrintPages;
    }

    @Override
    void refill() {
        System.out.println(name + " заправляется заменой лазерного картриджа");
    }

    @Override
    void print() {
        System.out.println(name + " печатает с помощью лазера и тонера");
    }
}
