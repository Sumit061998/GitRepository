package kiteAPPTestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAPPBasePackage.BaseClass1;
import kiteAPPUtilityPackage.UtitlityClass1;
import kiteAPPpomPackage.KiteAppHome;
import kiteAPPpomPackage.KiteAppLogin;
import kiteAPPpomPackage.KiteAppPin;

public class TestClassForPropertyFile extends BaseClass1 {
	KiteAppHome home;
	KiteAppLogin login;
	KiteAppPin Pin;
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		Reporter.log("Launching Browser",true);
		login=new KiteAppLogin(driver);
		home=new KiteAppHome(driver);
		Pin=new KiteAppPin(driver);
	}
	@BeforeMethod
	public void loginPage() throws IOException
	{
		login.sendUserName(UtitlityClass1.readDataFromPropertyFile("UN"));
		Reporter.log("Send UserName",true);
          login.sendPassword(UtitlityClass1.readDataFromPropertyFile("PWD"));
  		Reporter.log("Send Password",true);
  		login.clickOnLoginButton();
		Reporter.log("Click on Login Button",true);
  		UtitlityClass1.implicitTime(driver,1000);
	     Pin.sendPin(UtitlityClass1.readDataFromPropertyFile("PIN"));
			Reporter.log("Send PIN",true);
	     Pin.clickOnContinueButton();
			Reporter.log("Click on Continue Button",true);
	     UtitlityClass1.implicitTime(driver,1500);
	}
	
	
  @Test
  public void validateUserId() throws IOException 
  {
	  String actualResult = home.clickOnUserID();
	 String expectedResult = UtitlityClass1.readDataFromPropertyFile("UN1");
   Assert.assertEquals(actualResult, expectedResult,"UserId is not matching TV is Fail");
   Reporter.log("UserId is Matching TC is Pass",true);
   UtitlityClass1.captureScreenshot(driver);
   
  }
  
  @AfterMethod
  public void logout() throws InterruptedException
  {
		Reporter.log("Click on UserId Button",true);
		Reporter.log("Click on Logout Button",true);

	  home.clickOnLogOutButton();
  }
  @AfterClass
  public void closeBrowser()
  {		Reporter.log("Close Browser",true);

	  driver.close();
  }
}
