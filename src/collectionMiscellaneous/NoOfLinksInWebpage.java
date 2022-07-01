package collectionMiscellaneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksInWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    System.out.println("No.of Links present on webpage "+links.size());
	
           Iterator<WebElement> it = links.iterator();	
           while(it.hasNext())
           {
        	   System.out.println(it.next().getText());
           }
           
	}

}
