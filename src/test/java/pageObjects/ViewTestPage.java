package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewTestPage extends BasePage{
	

	WebDriver driver;
	
	public ViewTestPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='text']") 
	WebElement searchtest;
	
	@FindBy(xpath="//div[@class='title']") 
	WebElement titletest;
	
	@FindBy(xpath="//div[@class='jss1785']")
	WebElement patientname;

	@FindBy(xpath="//tr[@class='MuiTableRow-root MuiTableRow-hover']/td[1]") 
	WebElement clicktest;
	
	public void searchTest(String value) {
		searchtest.sendKeys(value);;
	}

	public void clickTest() {
		clicktest.click();
	}
	
	public String titleTest() {
		return titletest.getText();
	}	
	

	/*public String patientName() {
		return patientname.getText();
	}	*/
	

}
