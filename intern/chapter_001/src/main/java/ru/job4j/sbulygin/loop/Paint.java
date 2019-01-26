package ru.job4j.sbulygin.loop;

/**
 * Class Paint.
 *
 * @author sbulygin.
 * @version 1.0.
 * @since 26.01.19.
 */
public class Paint {
    /**
     * Method paint right pyramid:
     * ^
     * ^^
     * ^^^
     * @param height height pyramid.
     * @return pyramid.
     */
    public String rightTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
               if (row >= column) {
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
     * Method paint left pyramid:
     *   ^
     *  ^^
     * ^^^
     * @param height height pyramid.
     * @return pyramid.
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
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
     * Method paint pyramid:
     *   ^
     *  ^^^
     * ^^^^^
     * @param height height pyramid.
     * @return pyramid.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
