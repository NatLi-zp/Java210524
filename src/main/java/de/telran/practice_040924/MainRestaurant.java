package de.telran.practice_040924;

public class MainRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(100);
        Order order1 = new Order(1, "Peter", DishType.PASTA, OrderStatus.NEW);
        Order order2 = new Order(1, "Ivan", DishType.BURGER, OrderStatus.NEW);
        restaurant.addOrder(order1);
        restaurant.addOrder(order2);
        System.out.println(Restaurant.totalOrders);
    }
}
