package groupingStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupUse1 {
  @Test(groups="regression")
  public void MyMethod6() 
  {
	  Reporter.log("MyMethod6 is Running.....",true);
  }
  @Test
  public void MyMethod7() 
  {
	  Reporter.log("MyMethod7 is Running.....",true);
  }
  @Test(groups = "sanity")
  public void MyMethod8() 
  {
	  Reporter.log("MyMethod8 is Running.....",true);
  }
  @Test(groups = "sanity")
  public void MyMethod9() 
  {
	  Reporter.log("MyMethod9 is Running......",true);
  }
  
}
