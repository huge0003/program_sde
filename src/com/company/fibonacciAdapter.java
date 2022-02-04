package com.company;

import java.util.Arrays;
import java.util.List;

public class fibonacciAdapter implements F_Adapter{
    ConsoleReader adaptee;
    List<String> fibonnaciCode;
    public fibonacciAdapter(ConsoleReader reader){
        this.adaptee = reader;
        this.fibonnaciCode = Arrays.asList("1", "2", "3", "5", "13");
    }
    @Override
    public Boolean fibonacciBoolean() {
        return this.fibonnaciCode.contains(adaptee.readLine());
    }
}
