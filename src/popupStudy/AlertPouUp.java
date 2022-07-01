package popupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPouUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(100);
	
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	Alert alt1=driver.switchTo().alert();
	System.out.println(alt1.getText());
	alt1.dismiss();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
    Alert alt2 = driver.switchTo().alert();
    alt2.sendKeys("4578");
    alt2.accept();
	
	
	
	
	
	
	
	
	
	}

}
