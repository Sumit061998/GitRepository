package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_and_or.asp");
		
		//driver.close(); //Used to close Current Tab
		//driver.quit(); //Used to close All Tabs

		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
	//navigate() method-->use to open application,, backward,Refresh operations
		driver.navigate().to("https://www.flipkart.com/");
		
		
		driver.navigate().back();
		driver.navigate().forward();
		
	}
	

}
