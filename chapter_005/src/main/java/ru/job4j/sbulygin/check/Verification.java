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
        for (char symbolsOne : wordOne.toCharArray()) {
            if (map.containsKey(symbolsOne)) {
                map.put(symbolsOne, map.get(symbolsOne) + 1);
            } else {
                map.put(symbolsOne, 1);
            }
        }
        for (char symbolsTwo : wordTwo.toCharArray()) {
            if (!map.containsKey(symbolsTwo)) {
                return false;
            }
            int symbolCount = map.get(symbolsTwo);
            if (symbolCount > 1) {
                map.put(symbolsTwo, symbolCount - 1);
            } else {
                map.remove(symbolsTwo);
            }
        }
        return map.size() == 0;
    }
}

