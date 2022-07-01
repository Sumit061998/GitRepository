package popupStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://skpatro.github.io/demo/links/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.name("NewWindow")).click();
        //From above we just open new window
        //To perform action on child we need to switch selenium focus on child by using driver.switch().window("windowID");
        //For Window ID  we need to use getWindowHandle() &getWindowHandles()
        //getWindowHandle()-->only returns single main page ID 
        //getWindowHandles()-->It returns main page ID as well as child page Id
        //THerefore we use getWindowHandles();
        String IDofmainPage = driver.getWindowHandle();//From this we get only main page ID
        System.out.println("Main page ID "+IDofmainPage);

	 Set<String> allIDs = driver.getWindowHandles();//All IDs are received
	 
	 ArrayList<String> al=new ArrayList<>(allIDs);
	 
	 //System.out.println(al.get(1));
	 for(int i=0;i<=al.size()-1;i++)
	 {
		 System.out.println(al.get(i));
	 }
	 
		 String mainPageID = al.get(0);
		 System.out.println(mainPageID);
		String ChildPageID = al.get(1);
		driver.switchTo().window(ChildPageID);//Here Selenium focus Switch to Child Page
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		Thread.sleep(1000);
		//driver.close();//It is used to close current page 
		driver.quit();
		
		
		
		
	
	}

}
