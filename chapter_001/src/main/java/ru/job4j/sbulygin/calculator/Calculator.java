package ru.job4j.sbulygin.calculator;

/**
 * Class Calculator.
 * @author sbulygin.
 * @since 26.07.2018.
 * @version 1.0.
 */
public class Calculator {

    /**
     * Result field.
     */
    private double result;

    /**
     * Method add.
     * @param first first summand.
     * @param second the second term.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract.
     * @param first minuend.
     * @param second subtrahend.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method multiply.
     * @param first multiplicand.
     * @param second factor.
     */
    public void multiply(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method div.
     * @param first dividend.
     * @param second divider.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method getResult.
     * @return received value result
     */
    public double getResult() {
        return this.result;
    }
}