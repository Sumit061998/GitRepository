package scrollingStudy;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SimpleScrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
	//	driver.manage().window().maximize();
		        // +ve x value--> right hand side, Y value +ve --> down 
				// +ve x value--> right hand side, Y value -ve --> up 
				// -ve x value--> left hand side, Y value +ve --> down 
				// -ve x value--> left hand side, Y value -ve --> up 

		JavascriptExecutor je = ((JavascriptExecutor)driver);
		je.executeScript("window.scrollBy(50,500)");
	
		
	}

}
