package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass 
{
	@Test
	public void method() {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
   
   driver.get("https://www.flipkart.com/");
   System.out.println("method is running...");
	}
	
	@Test
	public void method2()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/login/");
	   Reporter.log("method2 is running.. ");
	   
	}
		@Test
		public void method3()
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://reqres.in/");
		   Reporter.log("method2 is running.. ",true);
	}
}
