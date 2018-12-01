package ru.job4j.sbulygin.maximum;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MaxTest
 *
 * @author sbulygin
 * @version 1.0
 * @since 31.10.18
 */
public class MaxTest {

    private Max maximum;

    @Before
    public void infoForTest() {
        maximum = new Max();
    }

    @Test
    public void whenFirstMoreSecondThenFirstMaximum() {
        int result = maximum.findMaximum(4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMoreFirstThenSecondMaximum() {
        int result = maximum.findMaximum(10, 12);
        assertThat(result, is(12));
    }

    @Test
    public void whenSecondMoreFirstAndThirdThenSecondMaximum() {
        int result = maximum.findMaximum(10, 12, 2);
        assertThat(result, is(12));
    }
}