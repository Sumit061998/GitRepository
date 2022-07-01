package pom1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://kite.zerodha.com/");      
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
		Sheet mysheet = WorkbookFactory.create(f).getSheet("KiteUN&Pass");
		String UserName = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String KitePin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		KiteLoginPage1 login=new KiteLoginPage1(driver);
		 login.sendUserName(UserName);
		 login.sendPassword(password);
		 login.clickOnLoginButton();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KitePinPage1 pin=new KitePinPage1(driver);
		pin.sendPin(KitePin);
		pin.clickOnContinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		KiteHomePage1 userid=new KiteHomePage1(driver);
		userid.clickOnUserID(UserName);
        Thread.sleep(100);
		userid.clickOnLogOutButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//a[@class='remove text-xxsmall']")).click();
        Thread.sleep(100);
		driver.close();
		
	}

}
