package com.grader;

public class Calculator {

    private double result;

    public void add(double param1, double param2) {
            this.result = param1 + param2;
    }

    public void subtraction(double param1, double param2) {
            this.result = param1 - param2;
    }

    public void multi(double param1, double param2) {
            this.result = param1 * param2;
    }

    public void division(double param1, double param2) {
        this.result = param1 / param2;
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

    public void cleanResult() {
        this.result = 0.0;
    }
}
