package kiteAPPpomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAppLogin
{ @FindBy(id="userid") private WebElement UN;

@FindBy(id="password") private WebElement PWD;

@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;

//2.Step-2

public KiteAppLogin(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//3.Step-3
public void sendUserName(String userName)
{
	UN.sendKeys(userName);
}

public void sendPassword(String password)
{
	PWD.sendKeys(password);
}
public void clickOnLoginButton()
{
	LoginButton.click();
}

}
