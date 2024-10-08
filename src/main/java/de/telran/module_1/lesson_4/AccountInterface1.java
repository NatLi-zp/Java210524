package de.telran.module_1.lesson_4;

public class AccountInterface1 implements Sumable<Integer> {

    private int id;
    private Integer sum;

    public AccountInterface1(int id, Integer sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public Integer getSum() {
        return sum;
    }

    @Override
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public int getId() {
        return id;
    }
}
