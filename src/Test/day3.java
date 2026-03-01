package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Test(dependsOnMethods={"mobile","accountcreation"})
	public void personal()
	{
		System.out.println("personal");
	}
	
	@Parameters({"URL","API/key"})
	@Test
	public void accountcreation(String testurl,String key)
	{
		System.out.println("accountcreation");
		System.out.println(testurl);
		System.out.println(key);
		
		
	}
	
	@Test(dataProvider="getData")
	public void accountdeletion(String username,String password)
	{
		System.out.println("accountdeletion");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(groups= {"smoke"})
	public void mobile()
	{
		System.out.println("mobile");
	}
	
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("login to application");
	}
	
	@DataProvider
	public Object[][] getData()
	{ //input is having 3 combinations of user name and passwrd
		Object[][] data=new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
	}

}
