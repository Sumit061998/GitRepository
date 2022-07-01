package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableStudy1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.upgrad.com/?utm_source=Google&utm_medium=BSearch&utm_campaign=IND_Acq_Web_Google_BSearch_All_All_All_Brand_T1&utm_content=upGrad_Pure&utm_term=upgrad&gclid=Cj0KCQjwyMiTBhDKARIsAAJ-9Vs2PYasElCVqU82tuxLKygsQYi5r15CE33zzhYLGHP_tM4rrvEEsvMaArR5EALw_wcB");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[text()='Sign Up']")).click();
		Thread.sleep(3000);
		WebElement Element = driver.findElement(By.xpath("//button[@type='submit']"));
		
		boolean result = Element.isEnabled();
		System.out.println(result);
		
		
	
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("4444444444");
Thread.sleep(100);
  boolean result1 = Element.isEnabled();
  System.out.println("Status is "+result1);
	}

}
