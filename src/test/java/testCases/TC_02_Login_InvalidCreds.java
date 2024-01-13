package testCases;

import testBase.BaseClass;
import pageObjects.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02_Login_InvalidCreds extends BaseClass{
	
	@Test
	public void verify_invalid_login()
	{
		LoginPage log= new LoginPage(driver);
		log.setEmail(fileobj.getProperty("Username1"));
		log.setPassword(fileobj.getProperty("Password2"));
		log.Login();
		
		String error="The password is invalid or the user does not have a password.";
		Assert.assertEquals(error, log.loginwithinvalidcreds());
	}
}
