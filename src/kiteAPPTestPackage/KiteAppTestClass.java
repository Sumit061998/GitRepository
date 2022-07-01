package kiteAPPTestPackage;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import kiteAPPBasePackage.BaseClass;
import kiteAPPUtilityPackage.UtitlityClass;
import kiteAPPpomPackage.KiteAppHome;
import kiteAPPpomPackage.KiteAppLogin;
import kiteAPPpomPackage.KiteAppPin;

public class KiteAppTestClass extends BaseClass{

	KiteAppHome  home;
	KiteAppLogin login;
	KiteAppPin pin;
	
	@BeforeClass
	public void launchbrowser() 
	{
	  openBrowser();
		 Reporter.log("Launching the Browser");
	  login=new KiteAppLogin(driver);
	  pin=new KiteAppPin(driver);
	  home=new KiteAppHome(driver);
	}
	@BeforeMethod
	public void loginPage() throws EncryptedDocumentException, IOException
	{
	 login.sendUserName(UtitlityClass.readDataFromExcel(0, 0));
	 Reporter.log("Sending UserName",true);
	 login.sendPassword(UtitlityClass.readDataFromExcel(0,1));
	 Reporter.log("Sending Password",true);
	 login.clickOnLoginButton();
	 Reporter.log("Click On Login Button",true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	 pin.sendPin(UtitlityClass.readDataFromExcel(0,2));
	 Reporter.log("Sending PIN",true);
	 pin.clickOnContinueButton();
	 Reporter.log("Click On Continue Button",true);
	 
	}
  @Test
  public void verifyUserID() throws EncryptedDocumentException, IOException 
  {
	  String actualresult = home.clickOnUserID();
	  String expectedresult=UtitlityClass.readDataFromExcel(0, 0);
	  
	  Assert.assertEquals(actualresult,expectedresult,"UserId is Not Matching TC is Fail");
	  Reporter.log("UserId is Matching TC is Pass",true);
	  
	  UtitlityClass.screenShot(driver);
	  
  }
  @AfterMethod
  public void logout() throws InterruptedException
  {	 Reporter.log("Click On UserId",true);
	  home.clickOnLogOutButton();
		 Reporter.log("Click On LogOut Button",true);
  }
  @AfterClass
  public void closeBrowser()
  {	 Reporter.log("Closing the Browser",true);
	  driver.close();
  }
  
  
}
