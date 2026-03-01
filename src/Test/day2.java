package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters( {"URL"})
	@Test
	public void wish2(String testurl)
	{
		System.out.println("HelloDay2");
		System.out.println(testurl);
	}
	
	@BeforeTest
	public void execute()
	{
		System.out.println("Execute first");
	}

}
