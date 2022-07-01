package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(100);
//		driver.navigate().to("https://www.flipkart.com/");
//		Thread.sleep(100);
//		driver.quit();
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		driver.navigate().to("https://www.flipkart.com/");		
		Thread.sleep(100);
		driver.navigate().back();
		Thread.sleep(100);
		driver.navigate().forward();
		Thread.sleep(100);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Headphone");
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		

	}

}
