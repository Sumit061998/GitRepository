package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableStudy2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    //To know how many rows in the table
	    
	    List<WebElement> rows = driver.findElements(By.xpath("//tr"));
	    int NoOfRows = rows.size();
	  System.out.println("Total No Of of Rows in Table ="+NoOfRows);
	    for(WebElement r:rows)
	    {
	    	System.out.println(r.getText());
	    }
	    System.out.println("============");
	  //To know How many Columns in the table
	  
	  List<WebElement> columns = driver.findElements(By.xpath("//th"));
	  int NoOfColumns = columns.size();
	  System.out.println("Total no Of Columns are ="+NoOfColumns);
	  
	  for(WebElement c:columns)
	  {
		  System.out.println(c.getText());
	  }
	  
	}

}
