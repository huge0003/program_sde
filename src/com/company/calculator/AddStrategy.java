package com.company.calculator;

public class AddStrategy implements CalculatorStrategy {

    @Override
    public int doCalculation(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
