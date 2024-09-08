package de.telran.practice_040924;

public enum OrderStatus {
    NEW,
    COOKING,
    READY,
    DELIVERED;//доставленный

    public boolean canChange(OrderStatus orderStatus){
       return !OrderStatus.DELIVERED.equals(orderStatus);
    }

}
