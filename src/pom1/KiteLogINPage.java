package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogINPage
{
	//1.Data Member Should be declare globally with access level private by using @FindBy Annotation
 @FindBy(id = "userid")    private WebElement UN;

 @FindBy(id ="password") private WebElement PWD;
 
 @FindBy(xpath = "//button[@type='submit']") private WebElement LogInButton;
 
 //2.Use constructor to initialize the Data Members by Using PageFactory class & initElements() method
  // Constructor Access Level Public    
 public  KiteLogINPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 //3. Utilize
 public void sendUserName()
 {
	 UN.sendKeys("ELR321");
 } 
 public void sendPassword()
 {
	 PWD.sendKeys("Dhana1111");
 }
 public void clickLoginButton()
 {
	 LogInButton.click();
 }
}
