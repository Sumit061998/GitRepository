package zerodha;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(100);
	File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
	 String UN = WorkbookFactory.create(f).getSheet("KiteUN&Pass").getRow(0).getCell(0).getStringCellValue();
	 String pass = WorkbookFactory.create(f).getSheet("KiteUN&Pass").getRow(0).getCell(1).getStringCellValue();
	  String pin = WorkbookFactory.create(f).getSheet("KiteUN&Pass").getRow(0).getCell(2).getStringCellValue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	 driver.get("https://kite.zerodha.com/");
		Thread.sleep(100);
     WebElement UserName = driver.findElement(By.id("userid"));
 	 UserName.sendKeys(UN);
 	Thread.sleep(100);
     WebElement Password = driver.findElement(By.id("password"));
     Password.sendKeys(pass);
 	Thread.sleep(100);
     WebElement LogIN = driver.findElement(By.xpath("//button[@type='submit']"));
     LogIN.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         WebElement PIN = driver.findElement(By.id("pin"));
         PIN.sendKeys(pin);
     	Thread.sleep(100);
         WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	                 continueButton.click();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	    WebElement userid = driver.findElement(By.xpath("//span[@class='user-id']"));
	userid.click();
	Thread.sleep(100);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(100);
	driver.close();
	}

}
