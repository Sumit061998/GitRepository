package dropDownUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(5000);
		//1.Store in reference variable
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		//2.Create the object of Select Class 
		Thread.sleep(2000);
		Select s=new Select(day);
		Thread.sleep(2000);
		//3.Methods
		s.selectByVisibleText("11");
		
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		Select s1=new Select(month);
		Thread.sleep(1000);
        s1.selectByIndex(5);
    	Thread.sleep(1000);
    	
        WebElement year = driver.findElement(By.id("year"));
    	Thread.sleep(1000);
    	Select s2=new Select(year);
    	Thread.sleep(1000);
             s2.selectByValue("1920");
             
             for(int i=0;i<=11;i++)
             {    	Thread.sleep(1000);

            	 s1.selectByIndex(i);
             }
             
             boolean result = s.isMultiple();
             System.out.println(result);
        
		
	}

}
