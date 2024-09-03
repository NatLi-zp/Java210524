package de.telran.practica_020924;

public class User {
    BankOperation bankOperation;

    public User(BankOperation bankOperation) {
        this.bankOperation = bankOperation;
    }

    public void makeOperation(){
        bankOperation.execute();
    }
}
