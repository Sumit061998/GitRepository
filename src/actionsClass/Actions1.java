package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.guru99.com/test/drag_drop.html");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
   //move to element using mouse actions 
    Actions act=new Actions(driver);
    WebElement MyElement1 = driver.findElement(By.xpath("//a[text()=' LOAN ']"));
	
	act.moveToElement(MyElement1).perform();


	//Click using Mouse Action
	
	WebElement testElement = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]"));
	
	//1st Way........
	act.moveToElement(testElement).perform();
	
	act.click().perform();
	
	//2nd Way................
//	act.moveToElement(testElement).click().build().perform();
	
    
	//3rd Way............
//    act.click(testElement).perform();
	

	//Right click----context click
	
	act.moveToElement(testElement).contextClick().click().build().perform();
	
	act.contextClick(testElement).perform();

	

	}

}
