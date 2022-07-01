package kiteAPPUtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtitlityClass1 
{
public static String readDataFromPropertyFile(String key) throws IOException
{
	
	Properties prop=new Properties();
    FileInputStream f=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\SeleniumStudy\\PropertyFile.properties");
    prop.load(f);
    String value = prop.getProperty(key);
    return value;
}
public static void captureScreenshot(WebDriver driver) throws IOException
{
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String random=RandomString.make(3);
	 File dest=new File("D:\\Sumit Software Testing\\Automation Testing\\Selenium\\8.ScreenShots\\pic"+random+".png");
	 FileHandler.copy(src, dest);
}
	
public static void implicitTime(WebDriver driver,int timeUnit)
{
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));	
}


}
