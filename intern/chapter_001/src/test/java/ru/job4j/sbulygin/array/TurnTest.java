package ru.job4j.sbulygin.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class TurnTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 28.01.19.
 */
public class TurnTest {
    /**
     * Test method with an even number of elements in the array.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    /**
     * Test method with an odd number of elements in an array.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 3, 5, 6, 8};
        int[] result = turner.back(input);
        int[] expect = new int[] {8, 6, 5, 3, 1};
        assertThat(result, is(expect));
    }
}
