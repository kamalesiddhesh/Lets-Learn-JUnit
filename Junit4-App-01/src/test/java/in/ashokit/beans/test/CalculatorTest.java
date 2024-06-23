package in.ashokit.beans.test;

import in.ashokit.beans.Calculator;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator c = null;
	
	@BeforeClass
	public static void init() {
		c = new Calculator();
	}
	
	@AfterClass
	public static void destroy() {
		c = null;
	}
	
	@Test
	public void testAdd() {
		
		Integer actualResult = c.add(10,20);
		Integer expectedResult = 30;
		
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testMultiply() {
		
		Integer actualResult = c.multiply(2,3);
		Integer expectedResult = 6;
		assertEquals(expectedResult,actualResult);
	}

}
