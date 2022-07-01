package softAssert;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndNotEquals {
  
	SoftAssert soft=new SoftAssert();
	
	@Test
  public void method() 
	{
		String a="Sumit";
		String b="Amar";
	
		soft.assertEquals(a,b,"The value of Strings are not equal , TC is fail");
    	Reporter.log("The Value of strings are equal TC is Pass ",true);	

		soft.assertNotEquals(a,b,"String is Equal TC is fail");
	     Reporter.log("String is not equal TC is Pass",true);
  
	    soft.assertAll();
	//		Assert.assertEquals(a,b,"The value of Strings are not equal , TC is fail");
//		Reporter.log("The Value of strings are equal TC is Pass ",true);
//		
//		
//		Assert.assertNotEquals(a,b,"String is Equal TC is Pass");
//		Reporter.log("String is noy equal TC is Fail",true);
  }
}
