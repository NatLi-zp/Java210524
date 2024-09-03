package de.telran.practica_020924;

public class PrintBalanceOperation implements BankOperation{
    double balance;

    public PrintBalanceOperation(double balance) {
        this.balance = balance;
    }

    @Override
    public void execute() {
        System.out.println("Ваш баланс = "+balance);
    }
}
