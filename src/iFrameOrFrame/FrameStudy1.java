package iFrameOrFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameStudy1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(100);
		
		driver.switchTo().frame("frame1");
		Thread.sleep(100);
		WebElement result = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		 driver.switchTo().frame(result);
		 Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(text.getText());
		Thread.sleep(500);
		driver.switchTo().parentFrame();
		Thread.sleep(100);
		WebElement result2 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(result2.getText());
		Thread.sleep(100);
		driver.switchTo().defaultContent();
		Thread.sleep(100);
		WebElement result3 = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		 System.out.println(result3.getText());
		
		
		
		
		
         
          
          
          
	}

}
