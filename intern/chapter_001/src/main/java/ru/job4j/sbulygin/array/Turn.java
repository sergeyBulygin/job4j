package ru.job4j.sbulygin.array;

/**
 * Class Turn.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 28.01.19.
 */
public class Turn {
    /**
     * Method flips the array.
     * @param array array.
     * @return inverted array.
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}
