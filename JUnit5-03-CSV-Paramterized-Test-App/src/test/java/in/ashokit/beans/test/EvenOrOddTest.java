package in.ashokit.beans.test;

import in.ashokit.beans.EvenOrOdd;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class EvenOrOddTest {
	
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)
	void evenOrOddTest(String input,String expected) {
		System.out.println(input);
		EvenOrOdd eoo = new EvenOrOdd();
		String actual = eoo.evenOrOddNum( Integer.parseInt(input) );
		assertEquals(expected,actual);
	}

}
