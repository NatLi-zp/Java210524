package de.telran.lesson_2.practice_260824_abstractClass;

public class BetaBank extends Bank {

    public BetaBank() {
        super("BetaBank", 10, 10000000, 18);
    }


    @Override
    public double calculateMonthlyPayment(int sum) {
        return sum * (rate + 1) / 100 / 12;
    }
}