package kiteAPPBasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{ 
	public WebDriver driver;
 public void openBrowser()
 {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://kite.zerodha.com/");      
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
 }
}
