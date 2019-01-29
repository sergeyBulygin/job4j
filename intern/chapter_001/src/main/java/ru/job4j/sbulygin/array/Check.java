package ru.job4j.sbulygin.array;

/**
 * Class Check.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 29.01.19.
 */
public class Check {
    /**
     * The method checks the array for
     * filling only true or false.
     * @param data boolean array.
     * @return boolean result.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] != data[index + 1]) {
                result = false;
            }
        }
        return result;
    }
}
