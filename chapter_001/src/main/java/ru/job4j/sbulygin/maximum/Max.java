package ru.job4j.sbulygin.maximum;

/**
 * Class Max
 * @author sbulygin
 * @version 1.0
 * @since 31.10.18
 */

public class Max {
    /**
     * Maximum of two numbers.
     * @param fist first numbers.
     * @param second second numbers.
     * @return maximum number.
     */
    public int findMaximum(int fist, int second) {
        return fist > second ? fist : second;
    }

    /**
     * Maximum of three numbers.
     * @param first first numbers.
     * @param second second numbers.
     * @param third third numbers.
     * @return maximum number.
     */
    public int findMaximum(int first, int second, int third) {
        int temp = findMaximum(first, second);
        temp = findMaximum(temp, third);
        return temp;
    }
}
