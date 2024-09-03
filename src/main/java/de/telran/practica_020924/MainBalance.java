package de.telran.practica_020924;

public class MainBalance {
    public static void main(String[] args) {
        double balance = 200.5;
        PrintBalanceOperation printB = new PrintBalanceOperation(balance);
        User user = new User(printB);
        user.makeOperation();


        Admin admin = new Admin(printB);
        admin.makeOperation(new WithdrawMoneyOperation(balance, 100));
    }
}
