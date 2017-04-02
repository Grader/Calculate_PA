package com.grader;

import java.io.IOException;

public class MathAction {


    public void checkAction(Calculator calc, String action, double first, double second) throws IOException {


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

    }

}
