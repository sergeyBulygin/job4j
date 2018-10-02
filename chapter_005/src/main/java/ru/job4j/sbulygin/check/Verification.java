package ru.job4j.sbulygin.check;

import java.util.HashMap;
import java.util.Map;

/**
 * Verification class.
 * @author sbulygin.
 * @since 02.10.2018.
 * @version 1.0.
 */
public class Verification {

    public boolean checkWords(String wordOne, String wordTwo) {

        if (wordOne == null || wordTwo == null || wordOne.length() != wordTwo.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < wordOne.length(); i++) {

            char charWordOne = wordOne.charAt(i);
            int  counterCharsWordOne = map.containsKey(charWordOne) ? map.get(charWordOne) : 0;
            map.put(charWordOne, ++counterCharsWordOne);

            char charWordTwo = wordTwo.charAt(i);
            int counterCharsWordTwo = map.containsKey(charWordTwo) ? map.get(charWordTwo) : 0;
            map.put(charWordTwo, --counterCharsWordTwo);

        }

        for (int countMap : map.values()) {
            if (countMap != 0) {
                return false;
            }
        }
        return true;
    }


}
