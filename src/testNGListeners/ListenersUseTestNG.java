package testNGListeners;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNGListeners.Listeners.class)
public class ListenersUseTestNG {
  @Test
  public void myMethod() 
  {
	  Reporter.log("myMethod is Running",true);
  }
  
  @AfterMethod
  public void method()
  {
	  Reporter.log("method is running ",true);
  }
}
