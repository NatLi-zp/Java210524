package de.telran.practice_110924;

import java.util.ArrayList;

public class Basket<T extends Product> {

    ArrayList<T> products = new ArrayList<>();


 void addProduct(T product){
     products.add(product);
 }

 void deleteProduct(T product){
     products.remove(product);
 }

    double getSum() {
        double sum = 0;
        for (T product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    void  printProducts(){
        for (T product : products) {
            System.out.println(product);
        }
    }
}
