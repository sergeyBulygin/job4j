package ru.job4j.sbulygin.array;

/**
 * Class Matrix.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 01.02.19.
 */
public class Matrix {
    /**
     * The method forms the multiplication table
     * @param size matrix size
     * @return table.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; column++) {
                table[row][column] = (column + 1) * (row + 1);
            }
        }
        return table;
    }
}
