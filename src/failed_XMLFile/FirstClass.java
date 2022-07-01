package failed_XMLFile;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstClass {
  @Test
  public void Method1()
  {
	  Reporter.log("Method1 is Running",true);
  }
  @Test
  public void Method2()
  {
	 // Assert.fail();
	  Reporter.log("Method2 is Running",true);
  }
  @Test
  public void Method3()
  {
	  Reporter.log("Method3 is Running",true);
  }
  @Test
  public void Method4()
  {
	  Reporter.log("Method4 is Running",true);
  }
}
