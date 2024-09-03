package de.telran.practica_020924;

public class Admin extends User{
    public Admin(BankOperation bankOperation) {
        super(bankOperation);
    }

    public void makeOperation(BankOperation additionalOperation ){
       super.makeOperation();
       additionalOperation.execute();
    }
}
