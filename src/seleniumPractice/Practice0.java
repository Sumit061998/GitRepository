package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice0 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	WebElement DropDown = driver.findElement(By.xpath("//select[@class='custom-select']"));
	
	Select s=new Select(DropDown);
	Thread.sleep(100);
	s.selectByVisibleText("Norway");
	
	driver.close();
	}

}
