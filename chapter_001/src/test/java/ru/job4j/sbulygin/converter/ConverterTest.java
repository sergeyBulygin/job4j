package ru.job4j.sbulygin.converter;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class for test converter.
 */
public class ConverterTest {

    private Converter converter;

    @Before
    public void infoForTest() {

        converter = new Converter();
    }

    /**
     * Test rubleToDollar.
     */
    @Test
    public void when60RubleToDollarThen1() {

        int result = converter.rubleToDollar(60);

        assertThat(result, is(1));
    }

    /**
     * Test rubleToEuro.
     */
    @Test
    public void when70RubleToEuroThen1() {

        int result = converter.rubleToEuro(70);

        assertThat(result, is(1));
    }

    /**
     * Test euroToRubles.
     */
    @Test
    public void when1EuroToRublesThen70() {

        int result = converter.euroToRubles(1);

        assertThat(result, is(70));
    }

    /**
     * Test dollarToRubles1.
     */
    @Test
    public void when1DollarToRublesThen60() {

        int result = converter.dollarToRubles(1);

        assertThat(result, is(60));
    }
}
