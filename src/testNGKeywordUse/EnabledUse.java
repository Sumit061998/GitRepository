package testNGKeywordUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
  @Test
  public void D()
  {
	  Reporter.log("Method D is Running",true);
  }
  @Test
  public void C()
  {
	  Reporter.log("Method C is Running",true);
  }
  @Test(enabled =false)
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
