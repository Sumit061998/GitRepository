package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestClass {
WebDriver driver;
KiteHomePage UserID;
KiteLogINPage login;
KitePinPage pin;
	
	@Test
  public void validUserID() throws InterruptedException
  {
		UserID.ClickOnUserName();
		
  }
	@BeforeMethod
	public void loginPage() throws InterruptedException
	{
		login.sendUserName();
		Thread.sleep(100);
		login.sendPassword();
		Thread.sleep(100);
		login.clickLoginButton();
		Thread.sleep(1000);
		pin.Sendpin();
		Thread.sleep(100);
		pin.Clickoncontinuebutton();
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		login=new KiteLogINPage(driver);
		UserID=new KiteHomePage(driver);
		pin=new KitePinPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
	@AfterMethod
	public void logOut()
	{
		UserID.ClickOnLogOutButton();
	}
	
	
}
