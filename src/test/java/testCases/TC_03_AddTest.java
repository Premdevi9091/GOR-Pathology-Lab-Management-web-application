package testCases;

import org.testng.annotations.Test;

import pageObjects.*;
import testBase.BaseClass;

public class TC_03_AddTest extends BaseClass{
	
	@Test
	public void verify_add_test() throws InterruptedException
	{
		LoginPage log= new LoginPage(driver);
		log.setEmail(fileobj.getProperty("Username"));
		log.setPassword(fileobj.getProperty("Password"));
		log.Login();
		
		DashboardPage db=new DashboardPage(driver);
		db.clickTest();				//click on Test 
		
		AddTestPage add=new AddTestPage(driver);
		add.clickManageTest();								 // click on Manage Test
		add.clickAddTest();    								 // click on Add Test
		add.AddTestName(fileobj.getProperty("TestName"));		//Add Test Name
		add.selectSampleTest();									//Select Sample test
		//add.selectSampleVolumn();								//Select Sample volume
		//add.selectSampleMode();
		add.AddAmount(fileobj.getProperty("Amount"));
		add.clickbtnAddTest();
	}

}
