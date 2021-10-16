package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class TestCalculate {
	private Calculator calculator;

	@BeforeTest
	public void init() {
		calculator = new Calculator();
	}

	public void emptyStringReturnsZero() {
		assertEquals(calculator.calculate(""), 0);
	}

	public void singleValueIsReplied() {
		assertEquals(calculator.calculate("1"), 1);
	}

	public void twoNumbersCommaDelimitedReturnsSum() {
		assertEquals(calculator.calculate("1,2"), 3);
	}

	public void twoNumbersNewLineDelimitedReturnsSum() {
		assertEquals(calculator.calculate("1\n2"), 3);
	}

	public void threeNumbersDelimitedBothWaysReturnsSum() {
		assertEquals(calculator.calculate("1,2,3"), 6);
	}

	@Test(expectedExceptions = Exception.class)
	public void negativeInputReturnsException() {
		calculator.calculate("-1");
	}
}
