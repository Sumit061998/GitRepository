package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement destination = driver.findElement(By.id("amt8"));
		
		Actions act=new Actions(driver);
		
		
		//1st Way............
		act.dragAndDrop(source, destination).perform();
	}

}
