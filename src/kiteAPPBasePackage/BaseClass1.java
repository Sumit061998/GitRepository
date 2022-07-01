package kiteAPPBasePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import kiteAPPUtilityPackage.UtitlityClass1;


public class BaseClass1
{  protected static WebDriver driver;
	public void openBrowser() throws IOException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver=new ChromeDriver(opt);
	      driver.manage().window().maximize();
	    driver.get(UtitlityClass1.readDataFromPropertyFile("URL"));      
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public static void captureScreenshot(String TCName ) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("D:\\Sumit Software Testing\\Automation Testing\\Selenium\\8.ScreenShots\\pic"+TCName+".png");
		 FileHandler.copy(src, dest);
	}
		

}
