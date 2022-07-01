package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	KiteHomePage UserID;
	KiteLogINPage login;
	KitePinPage pin;
	
	
	
	@Test
  public void verifyUserID()
	{
  }
	@Parameters("browser")
  @BeforeClass
	public void launchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\geckoDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		login=new KiteLogINPage(driver);
		UserID=new KiteHomePage(driver);
		pin=new KitePinPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	@BeforeMethod
	public void loginPage() throws InterruptedException
	{
		login.sendUserName();
		Thread.sleep(100);
		login.sendPassword();
		Thread.sleep(100);
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.Sendpin();
		Thread.sleep(100);
		pin.Clickoncontinuebutton();
	}
	
}
