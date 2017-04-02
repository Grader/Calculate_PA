package com.grader;

import java.io.IOException;

public class InteractRunner {

    public static void main(String[] args) throws IOException {

        Calculator calc = new Calculator();
        BuffReader input = new BuffReader();
        Double first = 0.0;

        do {
            Validator validator = new Validator();

            if (first == 0.0) {
                System.out.println("Enter first number:");
                first = Double.parseDouble(input.ask());
            }
            System.out.println("Enter second number:");
            Double second = Double.parseDouble(input.ask());

            System.out.println("Enter action:");
            String action = input.ask();
            if (action.equals("+")) {
                calc.add(first, second);
            }
            else if (action.equals("-")) {
                calc.subtraction(first, second);
            }
            else if (action.equals("*")) {
                calc.multi(first, second);
            }
            else if (action.equals("/")) {
                calc.division(first, second);
            }
            else if (action.equals("^")) {
                calc.exp(first, second);
            }
            else if (action.equals("√")) {
                calc.root(first, second);
            }

            System.out.println("Result: " + calc.getResult());
            System.out.println("Clear results? y/n");
            String clear = input.ask();
            if (clear.equals("y")) {
                calc.cleanResult();
            }
            else first = calc.getResult();
            System.out.println("You want to continue? y/n");
        } while ("y".equals(input.ask("You want to continue? y/n")));
    }
}
