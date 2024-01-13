package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.*;
import testBase.BaseClass;

public class TC_04_ViewTest extends BaseClass{
	
	@Test
	public void verify_view_test()
	{
		LoginPage log= new LoginPage(driver);
		log.setEmail(fileobj.getProperty("Username"));
		log.setPassword(fileobj.getProperty("Password"));
		log.Login();
		
		DashboardPage db=new DashboardPage(driver);
		db.clickTest();
		
		ViewTestPage view=new ViewTestPage(driver);
		view.searchTest(fileobj.getProperty("TestName"));
		driver.navigate().refresh();
		view.clickTest();
		
		Assert.assertEquals("Patient Test Profile",view.titleTest());
		//Assert.assertEquals(fileobj.getProperty("TestName"),view.patientName());	
	}

}
