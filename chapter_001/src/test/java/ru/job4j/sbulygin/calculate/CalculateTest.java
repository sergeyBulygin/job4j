package ru.job4j.sbulygin.calculate;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Colculate class.
 * @author sbulygin.
 * @since 25.07.2018.
 * @version 1.0.
 */
public class CalculateTest {
	/**
	* Test echo.
	*/ @Test
	public void whenTakeNameThenTreeEchoPlusName() {
	    String input = "Sergey Bulygin";
	    String expect = "Echo, echo, echo : Sergey Bulygin";
	    Calculate calc = new Calculate();
	    String result = calc.echo(input);
	    assertThat(result, is(expect));
	}

	/**
	* Test add.
	*/
	@Test
	public void whenAddOneToOneThenTwo() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(out.toString(), is("Hello World!" + System.getProperty("line.separator")));
	}
}
