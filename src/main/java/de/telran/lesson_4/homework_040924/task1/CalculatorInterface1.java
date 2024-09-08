package de.telran.lesson_4.homework_040924.task1;

public class CalculatorInterface1 implements Calculator<Integer> {

    @Override
    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer sub(Integer num1, Integer num2) {
        return  num1 - num2;
    }

    @Override
    public Integer multi(Integer num1, Integer num2) {
        return  num1 * num2;
    }

    @Override
    public Integer div(Integer num1, Integer num2) {
        return  num2 != 0 ? num1 / num2 : 0;
    }
}
