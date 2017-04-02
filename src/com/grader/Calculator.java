package com.grader;

public class Calculator {

    private double result;

    public double add(double param1, double param2) {
            this.result = param1 + param2;
        return this.result;
    }

    public double subtraction(double param1, double param2) {
            this.result = param1 - param2;
        return this.result;
    }

    public double multi(double param1, double param2) {
            this.result = param1 * param2;
        return this.result;
    }

    public double division(double param1, double param2) {
            this.result = param1 / param2;
        return this.result;
    }

    public void exp(double params, double ex) {
        this.result = Math.pow(params, ex);
    }

    public void root(double params, double index) {
        this.result = Math.exp(Math.log(params) / index);
    }

    public double getResult() {
        return this.result;
    }

    public double cleanResult() {
        this.result = 0.0;
        return this.result;
    }
}
