package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gjhiyjfk");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));  //Stored in Reference Variable & Return Type is web element 
           UserName.sendKeys("457848");
           Thread.sleep(100);
           UserName.clear(); //web element's clear() method
           
	}

}
