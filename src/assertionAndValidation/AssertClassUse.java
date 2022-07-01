package assertionAndValidation;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertClassUse {
  @Test
  public void Method() 
  {
//      String s="Sumit";
//	  String a="Pune";
//	  
////	  Assert.assertEquals(s,a,"It is not equal TC is fail");
////	  Reporter.log("It is Equal TC is Pass",true);
//	 
//	  Assert.assertNotEquals(a, s,"It is equal TC is Fail");
//	  Reporter.log("It is not equal TC is Pass");
     
//	  
//	  boolean b=true;
//	  boolean m=false;
//	  
////	  Assert.assertTrue(b,"Value is not true TC is Fail");
////	Reporter.log("Value is True TC is Pass",true);
//	  
//	  Assert.assertFalse(m,"Value is true TC is Fail");
//	  Reporter.log("Value is False Therefore TC is Pass",true);
	  
	  String h=null;
	  String c="NHBUHih";
//	  Assert.assertNull(h,"The Value is not null Therefore Test Case is Fail");
//	  Reporter.log("The VAlue is null Therefore Test Case is Pass",true);
 
	  
	  Assert.fail();
	  Assert.assertNotNull(c,"The Value is Null Therefore Test Case is Fail");
	  Reporter.log("The Value is Not Null Therefore Test Case is Pass ",true);
  
  }
}
