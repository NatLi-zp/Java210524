package de.telran.lesson_4.homework_040924.task1;

public class CalculatorInterface2 implements Calculator<Double> {

    private Double num1;
    private Double num2;

    @Override
    public Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    @Override
    public Double sub(Double num1, Double num2) {
        return  num1 - num2;
    }

    @Override
    public Double multi(Double num1, Double num2) {
        return  num1 * num2;
    }

    @Override
    public Double div(Double num1, Double num2) {
        return  num2 != 0 ? num1 / num2 : 0;
    }
}
