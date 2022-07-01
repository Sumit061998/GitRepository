package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableStudy4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    
        List<WebElement> tableBody = driver.findElements(By.xpath("//table//tbody//tr"));	
	   System.out.println("Size of the table is "+tableBody.size());
	
	   
	   
	
	}

}
