package de.telran.lesson_2.practice_260824_abstractClass;

public abstract class Bank {
    String name;
    double rate;
    int maxSum;
    int minClientAge;

    public Bank(String name, double rate, int maxSum, int minClientAge) {
        this.name = name;
        this.rate = rate;
        this.maxSum = maxSum;
        this.minClientAge = minClientAge;
    }

    public boolean checkAge(int age) {
        return age >= minClientAge;
    }

    public boolean checkSum(int sum) {
        return sum <= maxSum;
    }

    public abstract double calculateMonthlyPayment(int sum);

    public void printAllInfo() {
        System.out.print("Имя банка : " + name + "\n" + "% ставка :" + rate  + "\n" +
                "Макс. сумма кредита : " + maxSum + "\n" + "Мин. возраст: " + minClientAge);

    }
}
