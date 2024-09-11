package de.telran.practice_110924;

import java.util.HashSet;
import java.util.Set;

public class MainBasket {
    public static void main(String[] args) {

        Basket<Electronic> basket = new Basket<>();
        Set<Integer> ids = new HashSet<>();
        ids.add(1);
        ids.add(2);
        Electronic electronic1 = new Electronic("Radio",200, ids);
        Electronic electronic2 = new Electronic("TV",2000, ids);

        basket.addProduct(electronic1);
        basket.addProduct(electronic2);
        System.out.println(basket.getSum());
        basket.printProducts();


        Basket<Clothing> basketClothing = new Basket<>();
        Clothing clothing1 = new Clothing("T-Schirt",10);
        Clothing clothing2 = new Clothing("Schuhe",20);
        basketClothing.addProduct(clothing1);
        basketClothing.addProduct(clothing2);
        System.out.println(basketClothing.getSum());
        basketClothing.printProducts();

        System.out.println("Общая сумма = "+ (basket.getSum() + basketClothing.getSum()));
    }
}
