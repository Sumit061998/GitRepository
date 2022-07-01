package testNGKeywordUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsUse {
  @Test
  public void D()
  {
	  Reporter.log("Method D is Running",true);
  }
  @Test(dependsOnMethods = {"B"})
  public void C() 
  {
	 
	  Reporter.log("Method C is Running",true);
  }
  @Test(timeOut = 1000)
  public void B() throws InterruptedException
  {Thread.sleep(1100);
	  Reporter.log("Method B is Running",true);
  }
  @Test
  public void A()
  {
	  Reporter.log("Method A is Running",true);
  }
}
