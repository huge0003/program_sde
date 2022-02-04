package com.company;

import com.company.calculator.*;

public class Main {

    public static void main(String[] args) {
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        AddStrategy addStrategy = new AddStrategy();
        SubStrategy subStrategy = new SubStrategy();
        MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
        DivideStrategy divideStrategy = new DivideStrategy();

        Calculator calculator = new Calculator();

        Adapter adapter = new PiAdapter(reader);
        while (true) {

            writer.write("Wil je gebruik maken van het rekenmachine [1] of wil je weten of een getal zich bevind in de eerste 7 cijfers van pi? [2]");

            if(reader.readLine().equals(1)) {
                writer.write("Wil je optellen [+], aftrekken [-], vermenigvuldigen [*] of delen[/]?");
                String mode = reader.readLine();

                if (mode.equals("+")) {
                    calculator.setCalculatorStrategy(addStrategy);
                } else if (mode.equals("-")) {
                    calculator.setCalculatorStrategy(subStrategy);
                } else if (mode.equals("*")) {
                    calculator.setCalculatorStrategy(multiplyStrategy);
                } else if (mode.equals("/")) {
                    calculator.setCalculatorStrategy(divideStrategy);
                }

                writer.write("Vul het eerste nummer in");
                String firstNumStr = reader.readLine();
                int firstNum = Integer.parseInt(firstNumStr);

                writer.write("Vul het tweede nummer in");
                String secondNumStr = reader.readLine();
                int secondNum = Integer.parseInt(secondNumStr);

                writer.write("Het antwoord is:");
                int result = calculator.calculate(firstNum, secondNum);
                writer.write(result + "");
            } else writer.write("Welk nummer wil je controleren?");

            if(adapter.readBoolean()){
                writer.write("Dit getal bevindt zich in de eerste 7 cijfers van pi");
            } else {
                writer.write("Dit getal bevindt zich niet in de eerste cijfers van pi");
            }
        }
    }
}
