package com.grader;

import java.io.IOException;

public class InteractRunner {

    public static void main(String[] args) throws IOException {

        Calculator calc = new Calculator();
        BuffReader input = new BuffReader();
        MathAction mathAction = new MathAction();
        Double first = null;
        Double second = null;


        do {
            try {
                    System.out.println("Enter first number:");
                    first = Double.parseDouble(input.ask());
            } catch (NumberFormatException exFirst) {
                System.out.println("You entered not a number. Enter a number.");
            } finally {
                if (first == null) {
                    System.out.println("Enter first number:");
                    first = Double.parseDouble(input.ask());
                }
            }
            try {
                    System.out.println("Enter second number:");
                    second = Double.parseDouble(input.ask());
            } catch (NumberFormatException exSecond) {
                    System.out.println("You entered not a number. Enter a number.");
            } finally {
                    if (second == null) {
                        System.out.println("Enter second number:");
                        second = Double.parseDouble(input.ask());
                    }
            }
            System.out.println("Enter action:");
            String action = input.ask();
            mathAction.checkAction(calc, action, first, second);

            System.out.println("Result: " + calc.getResult());
            System.out.println("Clear results? y/n");
            String clear = input.ask();
            if (clear.equals("y")) {
                calc.cleanResult();
            }

            System.out.println("You want to continue? y/n");
        } while ("y".equals(input.ask("You want to continue? y/n")));
    }
}
