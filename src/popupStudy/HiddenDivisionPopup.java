package popupStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
//Hidden Division PopUp-->
//1.These popups are colorful.
//2.We can inspect the elements present in pop up.
//3.As we can inspect element present in popup then using selenium we can handle it & no need to switch.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
