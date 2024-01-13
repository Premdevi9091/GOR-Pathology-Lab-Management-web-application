package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTestPage extends BasePage{
	
	WebDriver driver;
	
	public AddTestPage(WebDriver driver)
	{
		super(driver);
	}	
	
	@FindBy(xpath="//span[contains(text(),'Manage Tests')]") 
	WebElement managetest;
	
	@FindBy(xpath="//span[contains(text(),'Add Test')]") 
	WebElement addtest;
	
	@FindBy(xpath="//input[@name='name']") 
	WebElement addtestname;
	
	@FindBy(xpath="//*[@id=\"mui-component-select-sample_type\"]") 
	WebElement sampletest;
	
	@FindBy(xpath="//ul[@role='listbox']/li[@data-value='SERUM']")
	WebElement sampletype;
	
	@FindBy(xpath="//*[@id=\"mui-component-select-sample_volume\"]") 
	WebElement samplevolumeclick;
	
	@FindBy(xpath="//ul[@role='listbox']/li[@data-value='1ml']") 
	WebElement samplevolume;
	
	@FindBy(xpath="//*[@id=\"mui-component-select-sample_mode\"]") 
	WebElement samplemodeclick;
	
	@FindBy(xpath="//ul[@role='listbox']/li[@data-value='FASTING']") 
	WebElement samplemode;
	
	@FindBy(name="amount") 
	WebElement amount;
	
	@FindBy(xpath="//div[@class='MuiCardContent-root']//button[2]") 
	WebElement btnaddtest;
	
	public void clickManageTest() {
		managetest.click();
	}
	
	public void clickAddTest() {
		addtest.click();
	}
	
	public void AddTestName(String name) {
		addtestname.sendKeys(name);
	}
	
	public void AddAmount(String amt) throws InterruptedException {
		amount.sendKeys(amt);
		Thread.sleep(5000);
	}
	
	public void selectSampleTest() {
		sampletest.click();
		sampletype.click();
	}
	
	public void selectSampleVolumn() {
		//js.executeScript("arguments[0].click();",samplevolumeclick);
		//wait.until(ExpectedConditions.elementToBeClickable(samplevolumeclick));
		js.executeScript("arguments[0].scrollIntoView(true);", samplevolumeclick);
		actions.moveToElement(samplevolumeclick).click().perform();
		samplevolumeclick.click();
		actions.moveToElement(samplevolume).click().perform();
		samplevolume.click();
	}
	
	public void selectSampleMode() {
		//js.executeScript("arguments[0].click();",samplemodeclick);
		js.executeScript("arguments[0].scrollIntoView(true);", samplemodeclick);
		actions.moveToElement(samplemodeclick).click().perform();
		samplemodeclick.click();
		actions.moveToElement(samplemode).click().perform();
		//js.executeScript("arguments[0].click();",samplemode);
		samplemode.click();
	}
	
	public void clickbtnAddTest() {
		//wait.until(ExpectedConditions.elementToBeClickable(btnaddtest));
		//btnaddtest.click();
		js.executeScript("arguments[0].click();",btnaddtest);
		//btnaddtest.click();
	}
}



	/*public void selectSampletype(String sampletype) {
		WebElement simpletype= driver.findElement(By.xpath("//ul[@role='listbox']/li[@data-value='"+sampletype+"']"));
		simpletype.click();
	}		

	public String dynamicXPath(String param1) {
		String.format("//ul[@role='listbox']li[@data-value='%s']",param1);
    }

    // Use @FindBy with How.XPATH and using attributes
    @FindBy(how = How.XPATH, using = dynamicXPath("abc"))
    private WebElement simpletype;


    // Your methods using the dynamicElement
    public void selectSimpleType() {
    	driver.findElement(By.xpath("//ul[@role='listbox']/li[@data-value='SERUM']")).click();
    	//simpletype.click();  // or any other action you want to perform
    }*/
