package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();

	Thread.sleep(100);
	driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();
	Thread.sleep(100);
    driver.findElement(By.xpath("(//label[@class='custom-control-label'])[8]")).click();
    Thread.sleep(100);
    driver.close();
	}

}
