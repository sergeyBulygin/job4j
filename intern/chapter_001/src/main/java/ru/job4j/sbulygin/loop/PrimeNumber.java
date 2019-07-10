/**
 * Today is 10.07.2019
 * sergt is  not the best
 */
package ru.job4j.sbulygin.loop;

/**
 * PrimeNumber class.
 */
public class PrimeNumber {
    /**
     * Method counts the number of prime numbers
     * @param finish extreme value.
     * @return number of prime numbers.
     */
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            boolean prime = true;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
            }
        }
        return count;
    }
}
