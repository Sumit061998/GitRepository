package iFrameOrFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        Thread.sleep(100);
        driver.switchTo().frame("iframeResult");
        Thread.sleep(100);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(100);
        driver.switchTo().parentFrame();
        Thread.sleep(100);
        driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	}

}
