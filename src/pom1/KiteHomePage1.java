package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage1 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOutButton;
	
	public KiteHomePage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnUserID(String expectedResult)
	{
		String actualResult = userID.getText();
		String expectResult=expectedResult;
		if(actualResult.equals(expectResult))
		{
			System.out.println("Result is Matching & Test Case is Pass");
			userID.click();
		}
		else
		{
			System.out.println("Result is not Matching & Test Case is Fail");
		}
	}
	
	public void clickOnLogOutButton()
	{
		LogOutButton.click();
	}
	
	
	
	
}


