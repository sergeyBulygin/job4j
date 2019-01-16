package ru.job4j.sbulygin.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Class FunctionCalculate.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 16.01.19.
 */
public class FunctionCalculate {
    /**
     * Method return list of results of calculating the function being passed.
     * @param start initial value of diapason.
     * @param end initial value of diapason.
     * @param func function.
     * @return list of results.
     */
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int index = start; index <= end; index++) {
            func.andThen(result::add).apply((double) index);
        }
        return result;
    }
    public static List<Double> diapasonNoCycle(int start, int end, Function<Double, Double> func) {
        return IntStream.rangeClosed(start,end)
                .mapToObj(Double::valueOf)
                .map(func)
                .collect(Collectors.toList());
    }
}
