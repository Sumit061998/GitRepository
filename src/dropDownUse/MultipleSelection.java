package dropDownUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);	
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);
        WebElement MultipleSelectDropDown = driver.findElement(By.id("cars"));
        Thread.sleep(1000);
        Select s=new Select(MultipleSelectDropDown);
        
       boolean result=s.isMultiple();
       System.out.println(result);
       
       s.selectByIndex(0);
       Thread.sleep(100);
       s.selectByIndex(1);
       Thread.sleep(100);
       s.selectByIndex(2);
       Thread.sleep(100);
       s.selectByIndex(3);
        
       //If we want to deselectAll -->first there should be select multiple 
       // s.deselectAll();
       
       //We can also deselect by using index,value,visibleText
       
       s.deselectByIndex(0);
       Thread.sleep(100);
       s.deselectByValue("opel");
       Thread.sleep(100);
        s.deselectByVisibleText("Audi");
        
        System.out.println(s.getFirstSelectedOption().getText());
        WebElement firstSelectedText = s.getFirstSelectedOption();
        String myText = firstSelectedText.getText();
        System.out.println(myText);
        
       System.out.println(s.getAllSelectedOptions().size());
     for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
     {
    	 System.out.println(i);
     }
       
       
        
	}

}
