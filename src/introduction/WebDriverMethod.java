package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
     
     driver.navigate().to("https://www.flipkart.com/");
     driver.navigate().forward();
    driver.navigate().back();
      driver.navigate().refresh();
            driver.getTitle();  //getTitle() is an Webdriver Method.It Gives the Title of the Application
     
      String title=driver.getTitle();
      System.out.println(title);
     System.out.println(driver.getTitle());
      
      driver.getCurrentUrl(); //getCurrentUrl() is an Webdriver Method.It gives the Current link of the Application
      String url=driver.getCurrentUrl();
      System.out.println(url);
      System.out.println(driver.getCurrentUrl());

	}

}
