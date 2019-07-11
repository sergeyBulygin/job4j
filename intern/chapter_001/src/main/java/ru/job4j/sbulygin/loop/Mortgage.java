/**
 * Today is 11.07.2019
 * sergt is  not the best
 */
package ru.job4j.sbulygin.loop;

/**
 *  Mortgage class.
 */
public class Mortgage {
    /**
     * The method of calculating the time of payment of the mortgage.
     * @param amount credit amount.
     * @param monthly monthly payment.
     * @param percent loan interest.
     * @return year.
     */
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        int sum = (int) (amount + (amount * percent / 100));
        while (sum > 0) {
            sum = sum - (monthly * 12);
            year++;
        }
        return year;
    }
}
