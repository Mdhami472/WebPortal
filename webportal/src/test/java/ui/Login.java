package ui;

import org.testng.annotations.Test;

public class Login 
{
	@Test(priority =1)
	public void bloginTest()
	{
		System.out.println("Login Successful");
	}
	
	@Test(priority = 2)
	public void alogout()
	{
		System.out.println("Succesfully logout");
	}
}
