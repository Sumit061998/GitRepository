package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 driver.manage().window().maximize();
	 Thread.sleep(100);
	 driver.findElement(By.xpath("//input[@value='Radio4']")).click();//Xpath by using Attribute
	 
	 driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));//Xpath by using text
	 driver.findElement(By.xpath("//label[contains(@for,'Radio4')]"));//xpath contains by using @attribute
      driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate Training Center')]"));// xpath contains by using text()
      driver.findElement(By.xpath("//input[@value='Radio1']")).click();
	}

}
