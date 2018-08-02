package ru.job4j.sbulygin.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class DummyBotTest.
 * @author sbulygin.
 * @since 02.08.2018.
 * @version 1.0.
 */
public class DummyBotTest {

    /**
     * Test greet answer.
     */
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    /**
     * Test byu answer.
     */
    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    /**
     * Test unknown answer.
     */
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Спросите другой вопрос.")
        );
    }
}
