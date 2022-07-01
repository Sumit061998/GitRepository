package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableStudy1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    
	    WebElement rowElement = driver.findElement(By.xpath("//td[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']"));
	System.out.println(rowElement.getText());
	
	
	List<WebElement> tableHeader = driver.findElements(By.xpath("//th"));
	
	for(WebElement t:tableHeader)
	{
		System.out.print(t.getText()+" ||");
	}
	System.out.println();
	List<WebElement> row3 = driver.findElements(By.xpath("//tr[3]"));
	for(WebElement r:row3)
	{
		System.out.print("|| "+r.getText()+" ||");
	}
	
	
	
	}

}
