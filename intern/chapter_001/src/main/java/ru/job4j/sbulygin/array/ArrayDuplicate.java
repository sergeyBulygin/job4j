package ru.job4j.sbulygin.array;

import java.util.Arrays;

/**
 * Class ArrayDuplicate.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 01.02.19.
 */
public class ArrayDuplicate {
    /**
     * Method removes duplicates from array.
     * @param array duplicate array.
     * @return no duplicate array
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
