package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
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
  @Test
  public void B()
  {
	  Reporter.log("Method B is Running",true);
  }
}
