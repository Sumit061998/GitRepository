package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	WebElement radioButton = driver.findElement(By.id("male"));
        radioButton.click();
        Thread.sleep(1000);
        driver.findElement(By.id("tuesday")).click();
   Thread.sleep(1000);
   driver.findElement(By.id("friday")).click();
   Thread.sleep(100);
   driver.close();
        
	}

}
