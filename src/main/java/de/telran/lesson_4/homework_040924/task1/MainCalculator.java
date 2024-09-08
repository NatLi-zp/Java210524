package de.telran.lesson_4.homework_040924.task1;

import de.telran.lesson_4.AccountInterface1;

public class MainCalculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        double num1_ = 5.5;
        double num2_ = 3.3;

        CalculatorInterface1 calculatorInterface1 = new CalculatorInterface1();
        System.out.println(num1 + " + " + num2 + " = " + calculatorInterface1.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calculatorInterface1.sub(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + calculatorInterface1.multi(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + calculatorInterface1.div(num1, num2));

        System.out.println();

        CalculatorInterface2 calculatorInterface2 = new CalculatorInterface2();
        System.out.println(num1_ + " + " + num2_ + " = " + calculatorInterface2.add(num1_, num2_));
        System.out.println(num1_ + " - " + num2_ + " = " + calculatorInterface2.sub(num1_, num2_));
        System.out.println(num1_ + " * " + num2_ + " = " + calculatorInterface2.multi(num1_, num2_));
        System.out.println(num1_ + " / " + num2_ + " = " + calculatorInterface2.div(num1_, num2_));
    }
}
