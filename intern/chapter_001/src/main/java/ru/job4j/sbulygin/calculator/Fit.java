package ru.job4j.sbulygin.calculator;

/**
 * Fit class.
 * @author sbulygin.
 * @since 01.08.2018.
 * @version 1.0.
 */
public class Fit {

    /**
     * CONST_MAN field.
     */
    private static final int CONST_MAN = 100;

    /**
     * CONST_WOMAN field.
     */
    private static final int CONST_WOMAN = 110;

    /**
     * Ideal weight for a man.
     * @param height growth.
     * @return ideal weight.
     */
    public double manWeight(double height) {

        return (height - CONST_MAN) * 1.15;
    }

    /**
     * Ideal weight for a woman.
     * @param height growth.
     * @return ideal weight.
     */
    public double womanWeight(double height) {

        return (height - CONST_WOMAN) * 1.15;
    }


}


