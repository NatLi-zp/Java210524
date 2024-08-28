package de.telran.lesson_2.practice_260824_abstractClass;

public class AlfaBank extends Bank{

    public AlfaBank() {
        super("AlphaBank", 7.5, 5000000, 21);
    }

    @Override
    public double calculateMonthlyPayment(int sum) {
         return sum * rate / 100 / 12;
    }
}
