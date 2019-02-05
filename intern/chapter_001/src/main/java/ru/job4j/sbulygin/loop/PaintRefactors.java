package ru.job4j.sbulygin.loop;

import java.util.function.BiPredicate;

import static java.lang.Math.abs;

/**
 * Class PaintRefactors.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 27.01.19.
 */
public class PaintRefactors {
    /**
     * The method builds a pyramid based
     * on the transmitted condition.
     * @param height height pyramid.
     * @param weight weight pyramid.
     * @param predict functional interface.
     * @return result.
     */
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    /**
     * Method paint right pyramid:
     * ^
     * ^^
     * ^^^
     * @param height height pyramid.
     * @return pyramid.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column);
    }
    /**
     * Method paint left pyramid:
     *   ^
     *  ^^
     * ^^^
     * @param height height pyramid.
     * @return pyramid.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1);
    }
    /**
     * Method paint pyramid:
     *   ^
     *  ^^^
     * ^^^^^
     * @param height height pyramid.
     * @return pyramid.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= abs(height - column - 1));
    }
}
