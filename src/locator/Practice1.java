package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.get("https://www.coverscart.com/");
		Thread.sleep(100);
		 driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone12");
		 Thread.sleep(100);
		 driver.findElement(By.xpath("(//span[text()='Apple'])[1]")).click();
		 Thread.sleep(100);
		 driver.close();
		

	}

}
