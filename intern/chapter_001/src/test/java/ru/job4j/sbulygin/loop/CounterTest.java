package ru.job4j.sbulygin.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class CounterTest.
 * @author sbulygin.
 * @since 14.01.2019.
 * @version 1.0.
 */
public class CounterTest {
    /**
     * Test add method class Counter.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter test = new Counter();
        int result = test.add(1, 10);
        int expect = 30;
        assertThat(result, is(expect));
    }
}
