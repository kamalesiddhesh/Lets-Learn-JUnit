package in.ashokit.beans.test;

import org.junit.jupiter.api.Test;

import in.ashokit.beans.StringUtils;

import static org.junit.jupiter.api.Assertions.*;
public class StringUtilsTest {
	@Test
	public void testConvertToInt() {
		String st = null;
		assertThrows(IllegalArgumentException.class,() -> StringUtils.convertToInt(st));
		
	}

}
