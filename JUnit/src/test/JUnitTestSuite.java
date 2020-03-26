package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

public class JUnitTestSuite {
	
	test objTest = new test();
	
	@Test
	public void testTest()
	{
		assertEquals("Hello", objTest.doGet());
	}

}
