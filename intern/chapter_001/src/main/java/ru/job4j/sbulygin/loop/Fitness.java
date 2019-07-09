package ru.job4j.sbulygin.loop;

/**
 * Today is 09.07.2019
 * sergt is  not the best
 */
public class Fitness {
    /**
     * New athletes came to the gym - Ivan and Nikolai. They want to progress very quickly and therefore consume
     * a lot of protein. Thanks to this diet, in a month Ivan increases the thrust force by 3 times, and Nikolay
     * increases the thrust force by 2 times in a month. Ivan wants to know how much he needs to train for the month
     * to overtake Nicholas in the power of thrust.
     *
     * @param ivan traction force Ivan.
     * @param nik traction force Nikolai.
     * @return month.
     */
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
