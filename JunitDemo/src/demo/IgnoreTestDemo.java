package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTestDemo
{
public String message = "How are you";
	
	JUnitMessage junitmessage = new JUnitMessage(message); // we have not created blank constructor
	// in JUnitMessage. We have created parameterised constructor.

	@Ignore
	@Test
	public void testJUnitMessage()
	{
		System.out.println("JUnit message printing.");
		assertEquals(message,junitmessage.PrintMessage() );
	}
	
	@Test
	public void testHiMessage()
	{
		message = "Hi"+message;
		System.out.println("Junit Hi Message is printing.");
		assertEquals(message,junitmessage.HiMessage());
	}

}
