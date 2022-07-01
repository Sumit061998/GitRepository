package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteHomePage2 {

	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOutButton;
	
	public KiteHomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public String clickOnUserID()
	{    
		String actualUserId=userID.getText();
     	return actualUserId;
//		if(actualResult.equals(expectResult))
//		{
//			System.out.println("Result is Matching & Test Case is Pass");
//			userID.click();
//		}
//		else
//		{
//			System.out.println("Result is nit Matching & Test Case is Fail");
//		}
		
		
	}
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(100);
		LogOutButton.click();
	}
	
	
}
