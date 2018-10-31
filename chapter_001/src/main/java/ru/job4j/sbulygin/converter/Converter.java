package ru.job4j.sbulygin.converter;

/**
 * Class Converter.
 * @author sbulygin.
 * @since 02.08.2018.
 * @version 1.0.
 */
    public class Converter {

        private static final int EVRORATE = 70;

        private static final int DOLLARRATE = 60;

        /**
         * Convert rubles into euros.
         * @param value rubles.
         * @return Euro.
         */
        public int rubleToEuro(int value) {
            return EVRORATE / value;
        }

        /**
         * Convert rubles into dollars.
         * @param value rubles.
         * @return Dollars.
         */
        public int rubleToDollar(int value) {
            return DOLLARRATE / value;
        }

        /**
         * Convert euros into rubles.
         * @param value rubles.
         * @return Euro.
         */
        public int euroToRubles(int value) {
            return value * EVRORATE;
        }

        /**
         * Convert dollars into rubles.
         * @param value rubles.
         * @return Euro.
         */
        public int dollarToRubles(int value) {
            return value * DOLLARRATE;
        }



    }


