package test.application.esgi.fr;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import application.esgi.fr.Lendemain;

public class LendemainTest {

	private Lendemain lendemain;

	@Before
	public void init() {
		lendemain = new Lendemain();
	}
	
	@Test
	public void shouldReturnParametreIncorrecteWhenDayIncorrect() {
		String result = lendemain.calculeDateLendemain(45, 10, 1985);
		Assert.assertThat(result, containsString("incorrecte"));
	}
	
	@Test
	public void shouldReturnParametreIncorrecteWhenMonthIncorrect() {
		String result = lendemain.calculeDateLendemain(5, 21, 1985);
		Assert.assertThat(result, containsString("incorrecte"));
	}
	
	@Test
	public void shouldReturnParametreIncorrecteWhenYearIncorrect() {
		String result = lendemain.calculeDateLendemain(4, 8, 3985);
		Assert.assertThat(result, containsString("incorrecte"));
	}
	
	@Test
	public void shouldReturnNextDayDate() {
		String result = lendemain.calculeDateLendemain(15, 1, 2016);
		Assert.assertEquals("16/1/2016", result);
	}
	
	@Test
	public void shouldReturnNextDayWithNextMonthAndYear() {
		String result = lendemain.calculeDateLendemain(31, 12, 2015);
		Assert.assertEquals("1/1/2016", result);
	}
	
	@Test
	public void shouldChangeMonthWithThirtyDaysMonth() {
		String result = lendemain.calculeDateLendemain(30, 9, 2015);
		Assert.assertEquals("1/10/2015", result);
	}
	
	@Test
	public void shouldReturnNextDayhWithThirtyDaysMonth() {
		String result = lendemain.calculeDateLendemain(14, 9, 2015);
		Assert.assertEquals("15/9/2015", result);
	}
}
