package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(timeOut=4000)
	public void selenium()
	{
		System.out.println("selenium");
	}
	
	@Test(groups= {"smoke"})
	public void Appium()
	{
		System.out.println("Appium");
	}
	
	@Test(enabled=false)
	public void cypress()
	{
		System.out.println("cypress");
	}
	
	@AfterSuite
	public void aftersui()
	{
		System.out.println("logout from application");
	}
	
	@BeforeMethod
	public void Beforeeverymethodinclass()
	{
		System.out.println("login to each portal");
	}
	
	@AfterMethod
	public void Aftereverymethodinclass()
	{
		System.out.println("logout to each portal");
	}
	
}
