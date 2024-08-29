package de.telran.lesson_2.practice_260824_abstractClass;

public class AlfaBank extends Bank implements LoyaltyProgram, RatingSystem{

    public AlfaBank() {
        super("AlphaBank", 7.5, 5000000, 21);
    }

    @Override
    public double calculateMonthlyPayment(int sum) {
         return sum * rate / 100 / 12;
    }

    @Override
    public double calculateLoyaltyDiscount(double amount) {
        if (amount > 1000) {
            return amount * 0.01;
        } else {
            return 0;
        }
    }

    @Override
    public String getBankInfo() {
        return String.format("Bank Name: %s\nInterest Rate: %.1f%%\nMax Loan Amount: %",
                name, rate, maxSum);
    }

    @Override
    public double calculateRating() {
        // Пример расчета рейтинга: низкий процент и высокий лимит кредита дают высокий рейтинг
        return 10 - rate / 2; // Чем ниже процент, тем выше рейтинг

    }
}
