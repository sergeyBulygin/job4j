package ru.job4j.sbulygin.profession;

import org.junit.Test;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Class EngineerTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 19.02.19.
 */
public class EngineerTest {
    @Test
    public void whenEngineerBuildDesignThenReturnHouse() {
        Engineer builder = new Engineer();
        Design drawing = new Design();
        assertThat(builder.build(drawing), instanceOf(House.class));
    }
}
