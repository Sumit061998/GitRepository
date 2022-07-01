package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.get("https://www.facebook.com/");
		Thread.sleep(100);
WebElement Element=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
		
System.out.println(Element.getText()); //getText() Method -->Print or Use
		
	String actualtext = Element.getText();
		
		System.out.println(actualtext);
	String expectedtext="Facebook helps you connect and share with the people in your life.";
			
		
		if(actualtext.equals(expectedtext))
		{
			System.out.println("This TC is Pass");
		}
	else {
			System.out.println("This TC is fail");
	}
	}

}
