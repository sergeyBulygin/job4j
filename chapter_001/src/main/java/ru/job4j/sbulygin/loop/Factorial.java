package ru.job4j.sbulygin.loop;

/**
 * Class Factorial.
 * @author sbulygin.
 * @since 14.01.2019.
 * @version 1.0.
 */
public class Factorial {
    /**
     * Еру method calculate the factorial of the number.
     * @param n the number.
     * @return factorial.
     */
    public static int calc(int n) {
       int result = 1;
       if (n == 0) {
           return result;
       }
       for (int i = 2; i <= n; i++) {
          result *= i;
       }
       return result;
    }
    public static int calcRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calc(n - 1);
    }
}
