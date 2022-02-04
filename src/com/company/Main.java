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

        P_Adapter pAdapter = new PiAdapter(reader);
        F_Adapter fAdapter = new fibonacciAdapter(reader);

            String checkNumber = "Welk nummer wil je controleren?";
            writer.write("Wil je gebruik maken van het rekenmachine [1], wil je weten of een getal zich bevind in de eerste 7 cijfers van pi? [2] of wil je weten of een getal zich bevind in de eerste 5 cijfers van de Fibonnacci-code [3]?");
            String readLine = reader.readLine();
            if (readLine.equals("1")) {
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
            } else if(readLine.equals("2")) {

                writer.write(checkNumber);


                if (pAdapter.piBoolean()) {
                    writer.write("Dit getal bevindt zich in de eerste 7 cijfers van pi");
                } else {
                    writer.write("Dit getal bevindt zich niet in de eerste 7 cijfers van pi");
                }
            } else if (readLine.equals("3")) {
                writer.write(checkNumber);

                if (fAdapter.fibonacciBoolean()) {
                    writer.write("Dit getal bevindt zich in de eerste 5 cijfers van de fibonacci-code");
                } else {
                    writer.write("Dit getal bevindt zich niet in de eerste 5 cijfers van de fibonacci-code");
                }
            }
    }
}
