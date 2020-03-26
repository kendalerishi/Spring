package demo;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner	
{
	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(IgnoreClassDemo.class);
		//Result result = JUnitCore.runClasses(JUnitTestSuite.class);
		//Result result = JUnitCore.runClasses(IgnoreTestDemo.class);
		
			for(Failure failure:result.getFailures())
			{
				System.out.println(failure.toString());
			}
			
			System.out.println("Result =="+result.wasSuccessful());
	}

}
