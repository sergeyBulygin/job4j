package ru.job4j.sbulygin.loop;

/**
 * Class Board.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 17.01.19.
 */
public class Board {
    /**
     * Method print chess board.
     * @param width width board.
     * @param height height board.
     * @return board.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}

