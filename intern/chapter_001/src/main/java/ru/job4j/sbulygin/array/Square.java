package ru.job4j.sbulygin.array;

/**
 * Class Square.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 27.01.19.
 */
public class Square {
    /**
     * The method fills the array with values ​​from 1
     * to the input parameter raised to a power.
     * @param bound last value in range from 1.
     * @return array of values.
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < bound; index++) {
            result[index] = (int) Math.pow(index + 1, 2);
        }
        return result;
    }
}
