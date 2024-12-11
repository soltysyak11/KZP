package org.example;

public class ExpressionEvaluator {
    public double evaluate(double x) throws ArithmeticException {
        double denominator = x - Math.cos(2 * x);
        if (denominator == 0) {
            throw new ArithmeticException("Denominator is zero, division by zero.");
        }
        return Math.sin(x - 9) / denominator;
    }
}