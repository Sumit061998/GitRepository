package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		

		WebElement TextBox = driver.findElement(By.id("displayed-text"));
         boolean Element = TextBox.isDisplayed();
         System.out.println(Element);
         Thread.sleep(100);
		TextBox.sendKeys("Hi Good Evening");
		Thread.sleep(1000);
		driver.findElement(By.id("hide-textbox")).click();
		
		boolean result1 = TextBox.isDisplayed();
		System.out.println("This TextBox Status is "+result1);
		
		
	}

}
