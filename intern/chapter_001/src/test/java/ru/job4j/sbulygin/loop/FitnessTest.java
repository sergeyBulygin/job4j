/**
 * Today is 09.07.2019
 * sergt is  not the best
 */
package ru.job4j.sbulygin.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Tests for Fitness class.
 */
public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(95, 90);
        assertThat(days, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(90, 95);
        assertThat(days, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(50, 90);
        assertThat(days, is(2));
    }
}
