package testNGKeywordUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCountUse {
	//invocationCount Method is used to run One Method Multiple Times
  @Test(invocationCount = 4 )
  public void D()
  {
	  Reporter.log("Method D is Running",true);
  }
  @Test
  public void C()
  {
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
