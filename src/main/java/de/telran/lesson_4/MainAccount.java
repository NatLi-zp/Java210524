package de.telran.lesson_4;

public class MainAccount {
    public static void main(String[] args) {
        Account account1 = new Account(1234567, 111);
        System.out.println("Account: " + account1.getId() + " -> " + account1.getSum());

        //-----------------Счет с Object типом
        AccountObject accountObject1 = new AccountObject(1234567, 111); //Object id = new Integer(1234567);- тут это выполняется под капотом
        System.out.println("AccountObject: " + accountObject1.getId() + " -> " + accountObject1.getSum());

        AccountObject accountObject2 = new AccountObject("DE1234567", 222); //Object id = new String("DE1234567");
        System.out.println("AccountObject: " + accountObject2.getId() + " -> " + accountObject2.getSum());

        //Наша большая проблема, можно передать любой ссылочный тип данных
        AccountObject accountObject3 = new AccountObject(true, 333); //Object id = new Boolean(true);
        System.out.println("AccountObject: " + accountObject3.getId() + " -> " + accountObject3.getSum());

        //-----------------Счет с Generic типом
        AccountGeneric<Integer> accountGeneric1 = new AccountGeneric<Integer>(1234567, 111);
        System.out.println("AccountGeneric: " + accountGeneric1.getId() + " -> " + accountGeneric1.getSum());
        //включается проверка типа и создание такого объекта не возможно
        //AccountGeneric<Integer> accountGeneric2 = new AccountGeneric<Integer>("DE1234567",111);

        AccountGeneric<String> accountGeneric2 = new AccountGeneric<>("DE1234567", 111);
        System.out.println("AccountGeneric: " + accountGeneric2.getId() + " -> " + accountGeneric2.getSum());

        //accountGeneric1 = accountGeneric2; // НЕЛЬЗЯ. AccountGeneric<Integer>  не точно такой же тип, как AccountGeneric<String>

        AccountGeneric<Integer> accountGeneric3 = new AccountGeneric<Integer>(445678, 333);
        System.out.println("AccountGeneric: " + accountGeneric3.getId() + " -> " + accountGeneric3.getSum());
        accountGeneric1 = accountGeneric3;
        System.out.println("AccountGeneric: " + accountGeneric1.getId() + " -> " + accountGeneric1.getSum());

        //!!! если не указать тип данных, то шаблон.тип автоматом станет Object
        //!!! Нельзя использовать, оставлен только для совместимости со старым кодом
        AccountGeneric accountGeneric4 = new AccountGeneric(true, 555);
        System.out.println("AccountGeneric: " + accountGeneric4.getId() + " -> " + accountGeneric4.getSum());

        AccountTwoParamGeneric<Integer, Double> accountTwoParamGeneric1 = new AccountTwoParamGeneric<>(1234567,111.01);
        System.out.println("AccountTwoParamGeneric: " + accountTwoParamGeneric1.getId() + " -> " + accountTwoParamGeneric1.getSum());

        AccountTwoParamGeneric<Integer, Integer> accountTwoParamGeneric2 = new AccountTwoParamGeneric<>(1234567,111);
        System.out.println("AccountTwoParamGeneric: " + accountTwoParamGeneric2.getId() + " -> " + accountTwoParamGeneric2.getSum());


        // Шаблонный интерфейс
        AccountInterface1 accountInterface1 = new AccountInterface1(1234567,111);
        System.out.println("AccountInterface1: " + accountInterface1.getId() + " -> " + accountInterface1.getSum());

        AccountInterface2<Double> accountInterface2 = new AccountInterface2<>(1234567,111.01);
        System.out.println("AccountInterface1: " + accountInterface2.getId() + " -> " + accountInterface2.getSum());

        AccountInterface3<String, Double> accountInterface3 = new AccountInterface3<>("DE1234567", 222.02);
        System.out.println("AccountInterface3: " + accountInterface3.getId() + " -> " + accountInterface3.getSum());
        accountInterface3.print();

        AccountInterface4<String, Double> accountInterface4 = new AccountInterface4<>("DE1234567", 222.02);
        System.out.println("AccountInterface4: " + accountInterface4.getId() + " -> " + accountInterface4.getSum());


    }

}
