package de.telran.module_1.lesson_4;

public class AccountGeneric<T> {
    private T id; // номер счета
    private int sum;

    public AccountGeneric(T id, int sum) {

        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
