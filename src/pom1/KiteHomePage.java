package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	@FindBy(xpath="//span[@class='user-id']")private WebElement UN;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOutButton;
    public KiteHomePage(WebDriver driver)
      {
    	PageFactory.initElements(driver,this);
    	}
    
    public void ClickOnUserName()
    {
    	String actualResult = UN.getText();
    	String expectedResult = "ELR321";
    	if(actualResult.equals(expectedResult))
    	{
    		System.out.println("UserName is Valid Test Case is Pass");
    	}
    	else
    	{
    		System.out.println("UserName is Not Valid Test Case is Fail");
    	}
    }
    public void ClickOnLogOutButton()
    {
    	UN.click();

    	LogOutButton.click();
    }
    }
