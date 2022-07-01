package pom1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException
	{ System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://kite.zerodha.com/");      
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
     KiteLogINPage login=new KiteLogINPage(driver);
               login.sendUserName();
               login.sendPassword();
               login.clickLoginButton();
                
       		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
       
                 KitePinPage pin=new KitePinPage(driver); 
                  pin.Sendpin();
               pin.Clickoncontinuebutton();
               
          		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
     KiteHomePage logout=new KiteHomePage(driver);
      logout.ClickOnUserName();
     Thread.sleep(100);
     logout.ClickOnLogOutButton();
     Thread.sleep(100);
     driver.quit();
	}
}
