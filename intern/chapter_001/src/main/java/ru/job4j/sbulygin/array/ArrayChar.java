package ru.job4j.sbulygin.array;

/**
 * Class ArrayChar.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 30.01.19.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Checks that the word begins with the prefix.
     * @param prefix prefix.
     * @return boolean result.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
            for (int index = 0; index < data.length / 2; index++) {
                if (data[index] != value[index]) {
                    result = false;
                }
            }
        return result;
    }
}
