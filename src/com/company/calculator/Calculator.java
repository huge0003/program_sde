package com.company.calculator;

import com.company.calculator.CalculatorStrategy;

public class Calculator {
    private CalculatorStrategy calculatorStrategy;

    public void setCalculatorStrategy(CalculatorStrategy calculatorStrategy){
        this.calculatorStrategy = calculatorStrategy;
    }

    public int calculate(int a, int b){
        return calculatorStrategy.doCalculation(a, b);
    }
}
