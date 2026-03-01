package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Beforeclass in day1");
	}

	@Test(groups= {"smoke"})
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("Hello1");
	}
	
	@AfterTest
	public void endtest()
	{
		System.out.println("execute last test");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Afterclass in day1");
	}
	

}
