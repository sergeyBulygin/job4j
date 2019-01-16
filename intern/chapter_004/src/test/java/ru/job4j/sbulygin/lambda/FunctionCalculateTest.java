package ru.job4j.sbulygin.lambda;


import org.junit.Test;


import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Class FunctionCalculateTest
 *
 * @author sbulygin.
 * @version 1.0
 * @since 16.01.19
 */
public class FunctionCalculateTest {

    private int start = 2;
    private int end = 5;

    /**
     * Test liner function.
     */
    @Test
    public void whenFunctionIsLinerThenReturnResultList() {
        List<Double> result = FunctionCalculate.diapason(start, end, x -> 3 * x + 1);
        List<Double> expect = Arrays.asList(7D, 10D, 13D, 16D);
        assertThat(result, is(expect));
    }

    /**
     * Test square function.
     */
    @Test
    public void whenFunctionIsSquareThenReturnResultList() {
        List<Double> result = FunctionCalculate.diapason(start, end, x -> Math.pow(x, 2));
        List<Double> expect = Arrays.asList(4D, 9D, 16D, 25D);
        assertThat(result, is(expect));
    }

    /**
     * Test logarithmic function.
     */
    @Test
    public void whenFunctionIsLogarithmicThenReturnResultList() {
        List<Double> result = FunctionCalculate.diapason(start, end, Math :: log);

        assertThat(result.get(0), is(closeTo(0.69, 0.004)));
        assertThat(result.get(1), is(closeTo(1.09, 0.009)));
        assertThat(result.get(2), is(closeTo(1.38, 0.009)));
        assertThat(result.get(3), is(closeTo(1.60, 0.010)));
    }

    /**
     * Test liner function.
     */
    @Test
    public void whenFunctionIsLinerThenReturnResultListNoCycle() {
        List<Double> result = FunctionCalculate.diapasonStream(start, end, x -> 3 * x + 1);
        List<Double> expect = Arrays.asList(7D, 10D, 13D, 16D);
        assertThat(result, is(expect));
    }

    /**
     * Test square function.
     */
    @Test
    public void whenFunctionIsSquareThenReturnResultListNoCycle() {
        List<Double> result = FunctionCalculate.diapasonStream(start, end, x -> Math.pow(x, 2));
        List<Double> expect = Arrays.asList(4D, 9D, 16D, 25D);
        assertThat(result, is(expect));
    }

    /**
     * Test logarithmic function.
     */
    @Test
    public void whenFunctionIsLogarithmicThenReturnResultListNoCycle() {
        List<Double> result = FunctionCalculate.diapasonStream(start, end, Math :: log);

        assertThat(result.get(0), is(closeTo(0.69, 0.004)));
        assertThat(result.get(1), is(closeTo(1.09, 0.009)));
        assertThat(result.get(2), is(closeTo(1.38, 0.009)));
        assertThat(result.get(3), is(closeTo(1.60, 0.010)));
    }
}
