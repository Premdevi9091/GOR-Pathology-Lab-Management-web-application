package testCases;

import testBase.BaseClass;
import pageObjects.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_Login_ValidCreds extends BaseClass{
	
	@Test
	public void verify_valid_login()
	{
		LoginPage log= new LoginPage(driver);
		log.setEmail(fileobj.getProperty("Username"));
		log.setPassword(fileobj.getProperty("Password"));
		log.Login();
		
		Assert.assertEquals("Dashboard", log.loginwithvalidcreds());
	}
}
