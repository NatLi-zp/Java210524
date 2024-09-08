package de.telran.practice_040924;

public class Order {
    private int id;
    private String nameOfClient;
    private DishType dishType;
    private OrderStatus orderStatus;

    public Order(int id, String nameOfClient, DishType dishType, OrderStatus orderStatus) {
        this.id = id;
        this.nameOfClient = nameOfClient;
        this.dishType = dishType;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", nameOfClient='" + nameOfClient + '\'' +
                ", dishType=" + dishType +
                ", orderStatus=" + orderStatus +
                '}';
    }

    void ChangeStatus(OrderStatus newOrderStatus) {
        if (newOrderStatus.canChange(orderStatus)) {
            orderStatus = newOrderStatus;
        } else {
            System.out.println("Статус = DELIVERED");
        }
    }
}
