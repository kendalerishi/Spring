package demo;

public class JUnitMessage
{
	private String message;
	public JUnitMessage(String message)
	{
		this.message = message;
	}
	
	public String PrintMessage()
	{
		System.out.println(message);
		return message;
	}
	
	public String HiMessage()
	{
		message = "Hi"+message;
		System.out.println(message);
		return (message);
	}
}
