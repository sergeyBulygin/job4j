package ru.job4j.sbulygin.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class PointTest.
 * @author sbulygin.
 * @since 02.08.2018.
 * @version 1.0.
 */
public class PointTest {

    /**
     * Test Point.
     *
     * Test method distance.
     */
    @Test
    public void whenCalculationDistanceFromOnePointToSecondThenResultTwo() {
        final Point x = new Point(10, 7);
        final Point y = new Point(12, 7);
        double result = x.distance(y);
        assertThat(result, is(2d));
    }
}
