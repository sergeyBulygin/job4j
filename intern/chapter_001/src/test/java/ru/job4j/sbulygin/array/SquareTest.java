package ru.job4j.sbulygin.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class SquareTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 27.01.19.
 */
public class SquareTest {
    /**
     * Test method calculate with bound 3.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }
    /**
     * Test method calculate with bound 6.
     */
    @Test
    public void whenBound6Then149162536() {
        int bound = 6;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36};
        assertThat(rst, is(expect));
    }

}
