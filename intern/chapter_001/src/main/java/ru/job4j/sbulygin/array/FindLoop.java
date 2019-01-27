package ru.job4j.sbulygin.array;

/**
 * Class FindLoop.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 27.01.19.
 */
public class FindLoop {
    /**
     * The method looks up the index of the element
     * in the array; otherwise, it returns -1.
     * @param data array.
     * @param element desired item.
     * @return index.
     */
    public int indexOf(int[] data, int element) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }
}
