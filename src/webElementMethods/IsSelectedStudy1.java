package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStudy1 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	Thread.sleep(1000);
	
	WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
	
	if(checkbox.isSelected())
	{
		System.out.println("CheckBox is already Selected");
	}
	else
	{
		System.out.println("CheckBox is not Checked");
		checkbox.click();
		if(checkbox.isSelected()) 
		{
			System.out.println("CheckBox is Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
	}
}
}
