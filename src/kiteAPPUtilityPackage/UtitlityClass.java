package kiteAPPUtilityPackage;

import java.io.File;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtitlityClass 
{

 public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
 {
	 File f=new File("D:\\Sumit Software Testing\\ExcelSheetReading.xlsx");
      Sheet mysheet = WorkbookFactory.create(f).getSheet("KiteUN&Pass");
      
      String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
      return value;
 }
 
 
 public static void screenShot(WebDriver driver) throws IOException 
 {
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String random=RandomString.make(3);
	 File dest=new File("D:\\Sumit Software Testing\\Automation Testing\\Selenium\\8.ScreenShots\\pic"+random+".png");
	 FileHandler.copy(src, dest);
	 
 }
 
 
}
