package demoJUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit 
{
   @Test
   public void testSetup() 
   {
      String str= new String("I am done with Junit setup");
//      String str1 = new String("I am done with Junit setup");
    assertEquals("I am done with Junit setup",str);
   }
   
   @Test
   public void testSetup1() 
   {
      StringBuffer sb = new StringBuffer("Ram");
      assertEquals("Ram",sb);
   }
}
