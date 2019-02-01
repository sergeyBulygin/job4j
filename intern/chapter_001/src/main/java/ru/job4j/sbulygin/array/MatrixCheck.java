package ru.job4j.sbulygin.array;

/**
 * Class MatrixCheck.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 01.02.19.
 */
public class MatrixCheck {
    /**
     * The method checks the square array is
     * filled with true or false diagonals.
     * @param data matrix.
     * @return boolean result.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0][0] != data[index][index]
            || data[0][data.length - 1] != data[index][data.length - 1 - index]) {
            result = false;
            break;
            }
        }
        return result;
    }
}
