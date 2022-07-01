package iFrameOrFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException 
	{  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
       
       WebElement text = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']"));
       String t = text.getText();
       System.out.println("Main Page Text -"+t);
       
        driver.switchTo().frame("frame1");
        Thread.sleep(100);
        driver.switchTo().frame("frame3");
        Thread.sleep(100);
        driver.findElement(By.id("a")).click();
        Thread.sleep(100);
        driver.switchTo().parentFrame();
        Thread.sleep(100);
        driver.findElement(By.tagName("input")).sendKeys("jhfjf");
       driver.switchTo().defaultContent();
       
       Thread.sleep(100);
       driver.switchTo().frame("frame2");
       Thread.sleep(100);
       //driver.findElement(By.id("animals")).click();
       WebElement d = driver.findElement(By.id("animals"));
       Select s=new Select(d);
       s.selectByIndex(1);
       s.selectByVisibleText("Avatar");
       s.selectByValue("big baby cat");
       Thread.sleep(100);

       driver.switchTo().defaultContent();
       driver.findElement(By.id("head")).click();
       
       driver.quit();
       
       
       
	}

}
