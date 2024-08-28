package de.telran.lesson_2.practice_260824_abstractClass;

public class GammaBank extends Bank {

    public GammaBank() {
        super("GammaBank", 12, 20000000, 20);

    }

    @Override
    public double calculateMonthlyPayment(int sum) {
        return sum * (rate + 2) / 100 / 12;
    }
}
