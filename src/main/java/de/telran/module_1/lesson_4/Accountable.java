package de.telran.module_1.lesson_4;

public interface Accountable<T, S> extends Sumable<S>, IdVisibleable<T>{

    void print();
}
