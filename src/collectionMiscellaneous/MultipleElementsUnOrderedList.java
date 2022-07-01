package collectionMiscellaneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsUnOrderedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://www.google.co.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    driver.findElement(By.name("q")).sendKeys("honda");
	   
	  List<WebElement> searchresults = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])//li"));
	  for(WebElement search:searchresults)  
	  {
		  System.out.println(search.getText());
	  }
	  String expectedresult = "honda city";
	  
	  for(WebElement result:searchresults)
	  {
		 String actualresult = result.getText();
		 
		 if(actualresult.equals(expectedresult))
		 {
			 result.click();
			 break;
		 }
	  }
	  driver.findElement(By.linkText("Images")).click();
	  
	}

}
