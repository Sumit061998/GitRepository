package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsStudy {
  @Test
  public void method()
  {
	  Reporter.log("Test Method is Running",true);
  }
  
  @BeforeMethod
  public void logIn()
  {
	  Reporter.log("Before Method is Running",true);
  }
  @BeforeClass
  public void launchUrl()
  {
	  Reporter.log("Before Class is Running",true);
  }
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("After Method is Running is Running",true);
  }
  @AfterClass
  public void closeUrl()
  {
	  Reporter.log("After Class  is Running",true);
  }
  @BeforeSuite
  public void getUrl()
  {
	  Reporter.log("Before Suite is Running",true);
  }
  @AfterSuite
  public void CloseWindow()
  {
	  Reporter.log("After Suite is Running",true);
  }
  @BeforeTest
  public void ts() 
  {
	  Reporter.log("Before Test is Running",true);
  }
  @AfterTest
  public void ts1()
  {
	  Reporter.log("After Test is Running",true);
  }
}
