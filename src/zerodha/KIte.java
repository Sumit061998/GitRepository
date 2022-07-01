package zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KIte {

	public static void main(String[] args) throws InterruptedException 
	{ 	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));     
	  WebElement userID = driver.findElement(By.id("userid"));
      userID.sendKeys("ELR321");
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("Dhana1111");
    WebElement LogINButton = driver.findElement(By.xpath("//button[text()='Login ']"));      
      LogINButton.click();
  	Thread.sleep(1000);     
      WebElement pin=driver.findElement(By.id("pin"));
      pin.sendKeys("982278");
      WebElement continueButton=driver.findElement(By.xpath("//button[@type='submit']"));
      continueButton.click();
      
      WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
      String actualresult = userid.getText();
	  String expectedresult="ELR320";
	  if(actualresult.equals(expectedresult))
	  {
		  System.out.println("Test Case is pass ");
	  }
	  else
	  {
		  System.out.println("Test Case is Fail");
	  }
	
	}

}
