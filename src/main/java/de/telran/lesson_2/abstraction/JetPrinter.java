package de.telran.lesson_2.abstraction;

public class JetPrinter extends Printer {

    public JetPrinter(String name, String model, int year) {
        System.out.println("------Работает конструктор JetPrinter::JetPrinter()");
        this.name = name;
        this.model = model;
        this.year = year; //хотя переменная обїявлена в предке, но она уже уснаследована потомком. Поєтому мож. использ. this
    }

    @Override
    void refill() {
        System.out.println(name + " заправляется заменой картриджа с краской");
    }

    @Override
    void print() {
        System.out.println(name + " печатает, распыляя краску из картриджа");
    }
}
