package ru.job4j.sbulygin.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class PaintRefactorsTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 27.01.19.
 */
public class PaintRefactorsTest {
    /**
     * Test method rightTrl.
     */
    @Test
    public void whenPyramid4Right() {
        PaintRefactors paint = new PaintRefactors();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("^   ")
                        .add("^^  ")
                        .add("^^^ ")
                        .add("^^^^")
                        .toString()
                )
        );
    }
    /**
     * Test method leftTrl.
     */
    @Test
    public void whenPyramid4Left() {
        PaintRefactors paint = new PaintRefactors();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("   ^")
                        .add("  ^^")
                        .add(" ^^^")
                        .add("^^^^")
                        .toString()
                )
        );
    }
    /**
     * Test method pyramid.
     */
    @Test
    public void whenPyramid4Height() {
        PaintRefactors paint = new PaintRefactors();
        String rst = paint.pyramid(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("   ^   ")
                        .add("  ^^^  ")
                        .add(" ^^^^^ ")
                        .add("^^^^^^^")
                        .toString()
                )
        );
    }
}

