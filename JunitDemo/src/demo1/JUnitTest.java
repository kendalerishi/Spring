package demo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JUnitTest {
	JUnit obj = new JUnit();
	
	@Test
	public void testPrintMessage1() {
	assertEquals("Hi",obj.PrintMessage1());
	}

}
