package webElementMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysByUsingJSExecutor {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(100);
	driver.get("https://www.facebook.com/");
	Thread.sleep(100);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('email'). value='123456';");
	Thread.sleep(500);
	driver.close();
	}

}
