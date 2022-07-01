package kiteAPPTestPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteAPPBasePackage.BaseClass1;
import kiteAPPUtilityPackage.UtitlityClass1;
import kiteAPPpomPackage.KiteAppHome;
import kiteAPPpomPackage.KiteAppLogin;
import kiteAPPpomPackage.KiteAppPin;
@Listeners(testNGListeners.Listeners.class)
public class TestNGForFailedTestScreenshot extends BaseClass1 {
	KiteAppHome home;
	KiteAppLogin login;
	KiteAppPin pin;
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login=new KiteAppLogin(driver);
		home=new KiteAppHome(driver);
		pin=new KiteAppPin(driver);
	}
	@BeforeMethod
	public void loginpage() throws IOException 
	{
		login.sendUserName(UtitlityClass1.readDataFromPropertyFile("UN"));
		login.sendPassword(UtitlityClass1.readDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		UtitlityClass1.implicitTime(driver,2000);
		pin.sendPin(UtitlityClass1.readDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		UtitlityClass1.implicitTime(driver,2000);
	}
  @Test
  public void validateUserID() throws IOException 
  { 
	  String actualUserId = home.clickOnUserID();
	  String expectedUserId = UtitlityClass1.readDataFromPropertyFile("UN1");
	  Assert.assertEquals(actualUserId,expectedUserId,"UN is not matching TC is faild ");
	  
  }
	@AfterClass
	public void logout() throws InterruptedException
	{
		home.clickOnLogOutButton();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
