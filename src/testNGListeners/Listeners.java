package testNGListeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAPPBasePackage.BaseClass1;

public class Listeners implements ITestListener
{
	BaseClass1 b1=new BaseClass1();
	
	//onStart
	//onFinish
	//onTestFailure
	//onTestSuccess
     //onTestSkipped
	//onTestStart
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Success of Test Case",true);
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Case is Skipped check dependent method ",true);
		ITestListener.super.onTestSkipped(result);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String TCName = result.getName();
		try {
			b1.captureScreenshot(TCName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
