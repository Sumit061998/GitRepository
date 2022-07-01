package popupStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("https://secure.indeed.com/auth");
    driver.manage().window().maximize();
    
    driver.findElement(By.id("login-google-button")).click();
	Thread.sleep(1000);

    String mainID = driver.getWindowHandle();
    System.out.println(mainID);
    
    Set<String> allID = driver.getWindowHandles();
    ArrayList <String> al=new ArrayList<>(allID);
    for(int i=0;i<=al.size()-1;i++)
    {
    	System.out.println(al.get(i));
    }
//    String MainID = al.get(0);
//    String ChildID=al.get(1);
    driver.switchTo().window(al.get(1));
	Thread.sleep(1000);
     driver.manage().window().maximize();
 	Thread.sleep(1000);
 	driver.findElement(By.id(""));
  	//driver.quit();
// 	driver.switchTo().window(al.get(0));
// 	Thread.sleep(1000);
//  driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(1000);
//driver.switchTo().window(al.get(2));

	}

}
