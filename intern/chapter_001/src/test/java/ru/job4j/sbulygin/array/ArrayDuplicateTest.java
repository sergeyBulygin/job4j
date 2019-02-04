package ru.job4j.sbulygin.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;


/**
 * Class ArrayDuplicateTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 01.02.19.
 */
public class ArrayDuplicateTest {
    @Test
    public void whenTheStringRepetitionRemovedThenObtainArrayWithoutRepetition() {
        ArrayDuplicate testArr = new ArrayDuplicate();
        String[] tempArray = {"world1", "world2", "world2", "world1", "world3", "world1"};
        String[] result = testArr.remove(tempArray);
        String[] expectResult = {"world1", "world2", "world3"};
        assertThat(result, arrayContainingInAnyOrder(expectResult));
    }
}
