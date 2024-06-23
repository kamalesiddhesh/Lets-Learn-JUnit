package in.ashokit.beans.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import in.ashokit.beans.PalindromeCheck;

public class PalindromeCheckTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"racecar","madam","radar","okoko"})
	public void testPalindrome(String s) {
		PalindromeCheck pc = new PalindromeCheck();
		boolean actual = pc.isPalindrome(s);
		assertTrue(actual);
		
		
	}

}
