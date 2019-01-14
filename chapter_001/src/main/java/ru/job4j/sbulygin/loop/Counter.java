package ru.job4j.sbulygin.loop;

/**
 * Class Counter.
 * @author sbulygin.
 * @since 14.01.2019.
 * @version 1.0.
 */
public class Counter {
    /**
     * The method adds all even values in the range.
     * @param start start value.
     * @param finish finish value
     * @return result.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
