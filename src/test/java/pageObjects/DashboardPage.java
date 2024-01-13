package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[contains(text(),'Tests')]") 
	WebElement clicktest;
	
	public void clickTest() {
		clicktest.click();
	}
	
	

}
