package in.ashokit.beans.test;

import org.junit.jupiter.api.Test;

import in.ashokit.beans.Calculator;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
	
	private static Calculator c = null;
	

	@Test
	public void testAdd() {
		
		Integer actualResult = c.add(10,20);
		Integer expectedResult = 30;
		
		assertEquals(expectedResult,actualResult);
	}
	
//	@Test
//	public void testMultiply() {
//		
//		Integer actualResult = c.multiply(2,3);
//		Integer expectedResult = 6;
//		assertEquals(expectedResult,actualResult);
//	}

}
