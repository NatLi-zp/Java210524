package de.telran.module_1.lesson_4;

public class AccountInterface4<T, S> implements IdVisibleable<T>, Sumable<S>{
    private T id;
    private S sum;

    public AccountInterface4(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public S getSum() {
        return sum;
    }

    @Override
    public void setSum(S sum) {

    }

//    @Override
//    public void print() {
//        System.out.println(id + " ----------- "+sum);
//    }
}
