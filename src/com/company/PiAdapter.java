package com.company;

import java.util.Arrays;
import java.util.List;

public class PiAdapter implements P_Adapter {

    private ConsoleReader adaptee;
    private List<String> piValue;

    public PiAdapter(ConsoleReader reader){
        this.adaptee = reader;
        piValue = Arrays.asList("3","1", "4", "1", "5", "9", "2");
    }

    @Override
    public Boolean piBoolean() {
        return piValue.contains(this.adaptee.readLine());
    }
}
