package testNGKeywordUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityUse {
  @Test(priority = -5)
  public void D()
  {
	  Reporter.log("Method D is Running",true);
  }
  @Test(priority = 0)
  public void C()
  {
	  Reporter.log("Method C is Running",true);
  }
  @Test(priority = -2)
  public void B()
  {
	  Reporter.log("Method B is Running",true);
  }
  @Test(priority = 2)
  public void A()
  {
	  Reporter.log("Method A is Running",true);
  }
}
