package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableStudy3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    List<WebElement> NoOfrows = driver.findElements(By.xpath("//tr"));
	    List<WebElement> NoOfcolumns = driver.findElements(By.xpath("//th"));
	    
	    int TotalNoOfRows = NoOfrows.size();
	    int TotalNoOfcolumns = NoOfcolumns.size();
	    
	    for(int i=1;i<=TotalNoOfRows;i++)
	    {
	          for(int j=1;j<=TotalNoOfcolumns;j++)	
	          {
	        	  if(i==1)
	        	  {
	        		 String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
	        	 System.out.println(text+"");
	        	  }
	        	  else
	        	  {
	        		 String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();  
	        	     System.out.println(text+"");
	        	  }
	          }
	          System.out.println();
	    }
	
	
	}

}
