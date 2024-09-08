package de.telran.practice_040924;

public class Restaurant {
    Order[] arrOrders;
    static int totalOrders = 0;


    public Restaurant(int maxCountOrder) {
        arrOrders = new Order[maxCountOrder];
    }

    public void addOrder(Order order){
        arrOrders[totalOrders] = order;
        totalOrders++;
    }
}
