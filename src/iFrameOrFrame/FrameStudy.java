package iFrameOrFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		//swithTo Selenium focus from main page to frame
		driver.switchTo().frame("courses-iframe");
        Thread.sleep(100);
        //current focus is on frame now
        driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();//This element is present on iframe (need to switch selenium focus from main page to frame)
	// to take action on page again, we need to switch selenium focused on frame to main page
        //parentsframe()=child from immediate parent & defaultcontent()=Any child to main page
        driver.switchTo().defaultContent();//switching selenium focus to main page
        driver.findElement(By.id("dropdown-class-example")).click();
	
	}

}
