package testNGKeywordUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test
  public void D()
  {
	  Reporter.log("Method D is Running",true);
  }
  @Test(timeOut = 1000)
  public void C() throws InterruptedException
  {
	  Thread.sleep(1200);
	  Reporter.log("Method C is Running",true);
  }
  @Test
  public void B()
  {
	  Reporter.log("Method B is Running",true);
  }
  @Test
  public void A()
  {
	  Reporter.log("Method A is Running",true);
  }
}
