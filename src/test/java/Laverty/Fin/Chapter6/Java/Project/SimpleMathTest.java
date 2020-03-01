package Laverty.Fin.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	/**
	 * @Test
	 * public void test() {
	 * 		fail("Not yet implemented");}
	 */
	
	
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath division = new SimpleMath();
		assertEquals(0,division.divide(0, 7),0.01);
	}
	
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath division1 = new SimpleMath();
		assertEquals(0.25,division1.divide(1, 4),0.01);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath division2 = new SimpleMath();
		division2.divide(6, 0);
	}

}
