package fireFoxDriver;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetUrl {

	public static void main(String[] args) 
{ 
System.setProperty("webdriver.gecko.driver","D:\\geckoDriver\\geckodriver.exe");
 WebDriver driver=new FirefoxDriver();
	
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");

}

}
