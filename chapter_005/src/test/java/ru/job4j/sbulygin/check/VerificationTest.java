package ru.job4j.sbulygin.check;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * VerificationTest class.
 * @author sbulygin.
 * @since 02.10.2018.
 * @version 1.0.
 */
public class VerificationTest {

    private Verification test;

    @Before
    public void prepareForTest() {

        test = new Verification();

    }

    @Test
    public void whenTwoSameWordsThenResultTrue() {

        boolean expected = test.checkWords("papa", "papa");

        assertThat(true, is(expected));

    }

    @Test
    public void whenTwoDifferentWordsThenResultFalse() {

        boolean expected = test.checkWords("papa", "mama");

        assertThat(false, is(expected));

    }

    @Test
    public void whenTwoAnagramWordsThenResultTrue() {

        boolean expected = test.checkWords("papa", "apap");

        assertThat(true, is(expected));

    }

    @Test
    public void whenTwoLongWordsThenResultTrue() {

        boolean expected = test.checkWords("papaaapapap", "apappaapapa");

        assertThat(true, is(expected));

    }

    @Test
    public void whenTwoLongWordsHaveOtherSymbolOneThenResultFalse() {

        boolean expected = test.checkWords("papaaapapap", "apapoaapapa");

        assertThat(false, is(expected));

    }

    @Test
    public void whenTwoDifferentLengthWordsThenResultFalse() {

        boolean expected = test.checkWords("papaaapapap", "apappaa");

        assertThat(false, is(expected));

    }

    @Test
    public void whenTwoOtherSymbolWordsThenResultTrue() {

        boolean expected = test.checkWords("&&**%$#", "*%*&#&$");

        assertThat(true, is(expected));

    }

}
