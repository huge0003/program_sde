package com.company;

import com.company.Adapter;
import com.company.ConsoleReader;

import java.util.Arrays;
import java.util.List;

public class PiAdapter implements Adapter {

    private ConsoleReader adaptee;
    private List<String> piValue;
    public PiAdapter(ConsoleReader reader){
        this.adaptee = reader;
        piValue = Arrays.asList("3","1", "4", "1", "5", "9");
    }
    @Override
    public Boolean readBoolean() {
        return piValue.contains(this.adaptee.readLine());
    }
}
