package ru.job4j.sbulygin.loop;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class BoardTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 17.01.19.
 */
public class BoardTest {
    private Board board;
    private String line;
    @Before
    public void setupTest() {
        board =new Board();
        line = System.getProperty("line.separator");
    }
    /**
     * Test method paint 3X3.
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        String result = board.paint(3, 3);
        String expected = String.format("X X%s X %sX X%s", line, line, line);
        assertThat(result, is(expected));
    }
    /**
     * Test method paint 5X4.
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        String result = board.paint(5, 4);
        String expected = String.format("X X X%s X X %sX X X%s X X %s", line, line, line, line);
        assertThat(result, is(expected));
    }
}


