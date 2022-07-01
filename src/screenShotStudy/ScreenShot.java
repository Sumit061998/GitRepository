package screenShotStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.get("https://www.w3schools.com/");
		
		 Thread.sleep(1000);
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//Taking ScreenShot
		 //After Taking ScreenShot it Store in temporary location.If to Store in desire location use file class object & gie the path as Parameter
		 File destination=new File("D:\\Sumit Software Testing\\Automation Testing\\Selenium\\ScreenShots\\myscreenshot.png");
		 
		 FileHandler.copy(source, destination);
	}

}
