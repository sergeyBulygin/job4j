package ru.job4j.sbulygin.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MatrixTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 01.02.19.
 */
public class MatrixTest {
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
    @Test
    public void when6on6() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(6);
        int[][] expect = {
                     {1, 2, 3, 4, 5, 6},
                   {2, 4, 6, 8, 10, 12},
                  {3, 6, 9, 12, 15, 18},
                 {4, 8, 12, 16, 20, 24},
                {5, 10, 15, 20, 25, 30},
                {6, 12, 18, 24, 30, 36},
        };
        assertThat(table, is(expect));
    }
}
