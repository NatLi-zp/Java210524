package de.telran.module_1.lesson_4;

public class AccountObject {
    private Object id;  // номер счета
    private int sum;

    public AccountObject(Object id, int sum) {
        if (id instanceof Integer || id instanceof String) { //приходилось писать
            this.id = id;
        } else {
            System.out.println("Не корректрый тип данных id");
        }
        this.sum = sum;
    }

    public Object getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
