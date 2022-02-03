package com.company.calculator;

import com.company.calculator.CalculatorStrategy;

public class MultiplyStrategy implements CalculatorStrategy {

    @Override
    public int doCalculation(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
}
