package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gjhiyjfk");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("14521");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
