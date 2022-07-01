package scrollingStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	    
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	    
	    //For scrollIntoView 
	    WebElement element = driver.findElement(By.id("hide-textbox"));
	    
	    JavascriptExecutor j= ((JavascriptExecutor)driver); 
	    
	    j.executeScript("arguments[0].scrollIntoView(true);",element);
	    
	    element.click();
	}

}
