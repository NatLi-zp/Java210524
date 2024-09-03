package de.telran.practica_020924;

public class WithdrawMoneyOperation implements BankOperation {
    double balance;
    double sumTakeMoney;

    public WithdrawMoneyOperation(double balance, double sumTakeMoney) {
        this.balance = balance;
        this.sumTakeMoney = sumTakeMoney;
    }

    @Override
    public void execute() {
        if (sumTakeMoney <= balance) {
            balance -= sumTakeMoney;
            System.out.println("Ваш конечный баланс = " + balance);
        } else {
            System.out.println("Ваш баланс слишком мал. Не можете снять = " + sumTakeMoney);
        }
    }
}
