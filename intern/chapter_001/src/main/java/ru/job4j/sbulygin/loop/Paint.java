package ru.job4j.sbulygin.loop;

/**
 * Class Paint.
 *
 * @author sbulygin.
 * @version 1.0.
 * @since 26.01.19.
 */
public class Paint {
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
}
