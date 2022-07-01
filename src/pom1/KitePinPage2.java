package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage2 {
@FindBy(id="pin") private WebElement PIN;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	public KitePinPage2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void sendPin(String KitePin)
	{
		PIN.sendKeys(KitePin);
	}
	
	public void clickOnContinueButton()
	{
		ContinueButton.click();
	}
}
