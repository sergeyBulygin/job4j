package ru.job4j.sbulygin.loop;

import java.util.function.BiPredicate;

/**
 * Class PaintRefactors.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 27.01.19.
 */
public class PaintRefactors {
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight ; column++) {
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
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column);
    }
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1);
    }
    public String pyramid(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1 && row + column - 1 >= column);
    }
}
