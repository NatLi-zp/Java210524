package de.telran.module_1.lesson_2.practice_260824_abstractClass;

public class MainBank {
    public static void main(String[] args) {
        AlfaBank alfaBank = new AlfaBank();
        BetaBank betaBank = new BetaBank();
        GammaBank gammaBank = new GammaBank();

        Client client1 = new Client("Ilia", 15, 1000);
        Client client2 = new Client("Peter", 25, 12000);


        // alfaBank.calculateMonthlyPayment();
        checkPossibilityClient(client1, alfaBank);
        checkPossibilityClient(client1, betaBank);
        getDiscountInfo(client1.needSum, alfaBank);
        getDiscountInfo(client2.needSum, alfaBank);
        System.out.println("Рейтинг банка "+alfaBank.name+" = "+alfaBank.calculateRating());
//        System.out.println(alfaBank.calculateMonthlyPayment(client1.needSum));
//        System.out.println(betaBank.calculateMonthlyPayment(client1.needSum));
//        System.out.println(gammaBank.calculateMonthlyPayment(client1.needSum));
       // alfaBank.printAllInfo();


    }

    public static void checkPossibilityClient(Client client, Bank bank) {
        if (bank.checkAge(client.age) && bank.checkSum(client.needSum)) {
            System.out.println("Для клиента " + client.name + " кредит возможен в банке " + bank.name);
        } else {
            System.out.println("Для клиента " + client.name + " кредит невозможен в банке " + bank.name);
        }
    }

    public static void getDiscountInfo(double needSum, AlfaBank bank){
double discont = bank.calculateLoyaltyDiscount(needSum);
        System.out.println("Для банка "+ bank.name + " дисконт = "+discont);
    }
}
