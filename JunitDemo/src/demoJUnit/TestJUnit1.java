package demoJUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit1 
{
   @Test
   public void testSetup2() 
   {
      String str= new String("I am done with Junit setup");
//      String str1 = new String("I am done with Junit setup");
    assertEquals("I am done with Junit setup",str);
   }
   
   @Test
   public void testSetup3() 
   {
      String sb = new String("Ram");
      assertEquals("Ram",sb);
   }
}
