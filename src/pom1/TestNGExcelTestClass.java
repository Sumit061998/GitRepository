package pom1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExcelTestClass {
	WebDriver driver;
	KiteHomePage2 UserID;
	KiteLogINPage2 login;
	KitePinPage2 pin;
	Sheet mysheet;
		@Test
	  public void validUserID() 
	  {
			 String expectedID = mysheet.getRow(0).getCell(0).getStringCellValue();
	          String actualID = UserID.clickOnUserID();
	          Assert.assertEquals(expectedID,actualID,"UserId is not matching TC is Fail");
	          Reporter.log("UserId is Matching TC is Pass",true);
	  }
		@BeforeMethod
		public void loginPage() throws InterruptedException
		{
			login.sendUserName(mysheet.getRow(0).getCell(0).getStringCellValue());
			Thread.sleep(100);
			Reporter.log("Enter the User Name",true);
			login.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
			Thread.sleep(100);
			Reporter.log("Enter the Password",true);
			login.clickOnLoginButton();
			Reporter.log("Click on LogIN Button",true);
			Thread.sleep(1000);
			pin.sendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
			Reporter.log("Enter the Pin",true);
			Thread.sleep(100);
			pin.clickOnContinueButton();
			Reporter.log("Click on Continue Button",true);

		}
		@BeforeClass
		public void launchBrowser() throws EncryptedDocumentException, IOException
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Reporter.log("Launching Browser ",true);
			login=new KiteLogINPage2(driver);
			UserID=new KiteHomePage2(driver);
			pin=new KitePinPage2(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
		     mysheet = WorkbookFactory.create(f).getSheet("KiteUN&Pass");
		}
		@AfterClass
		public void closeBrowser()
		{
			driver.close();
			Reporter.log("Close the Browser",true);

		}
		@AfterMethod
		public void logOut() throws InterruptedException
		{Thread.sleep(100);
			UserID.clickOnLogOutButton();
			Reporter.log("Click on LogOut Button",true);
		}
}
