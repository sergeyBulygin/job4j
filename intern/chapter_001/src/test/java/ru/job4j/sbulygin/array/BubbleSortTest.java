package ru.job4j.sbulygin.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class BubbleSortTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 30.01.19.
 */
public class BubbleSortTest {
    @Test
    public void whenUnsortedArraysThenReturnSortedArray() {
        final BubbleSort testArr = new BubbleSort();
        final int[] tempArray = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        final int[] result = testArr.sort(tempArray);
        final int[] expectResult = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expectResult));
    }
}
