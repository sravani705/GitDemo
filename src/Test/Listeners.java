package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test result failed " + result.getName()+result.getMethod());
		
	}
	
    public void onTestSkipped(ITestResult result) {
    	
    	System.out.println("I successfully skipped listener passcode");
	}
    
    public void onTestSuccess(ITestResult result) {
    	
    	System.out.println("I successfully executed listener passcode");
		
	}
    
    public void onTestStart(ITestResult result) {
		
	}
    
    
    
    
	
	

}
