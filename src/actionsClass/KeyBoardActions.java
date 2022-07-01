package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		
		//textBox.sendKeys("India");
		
		Actions act=new Actions(driver);
		
	//  act.sendKeys(textBox,"Shahada").perform();
			
		act.keyDown(textBox,Keys.SHIFT).sendKeys("abhijit").keyUp(Keys.SHIFT).sendKeys("bhamare").build().perform();
	}

}
