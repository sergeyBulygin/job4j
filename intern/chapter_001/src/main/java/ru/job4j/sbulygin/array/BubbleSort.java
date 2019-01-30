package ru.job4j.sbulygin.array;

/**
 * Class BubbleSort.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 30.01.19.
 */
public class BubbleSort {
    /**
     * Method sorts array by permutation method.
     * @param array unsorted array.
     * @return sorted array.
     */
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
