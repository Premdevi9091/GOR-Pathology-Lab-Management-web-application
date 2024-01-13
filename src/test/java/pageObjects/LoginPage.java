package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{	

		WebDriver driver;
		
		public LoginPage(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(name="email") 
		WebElement email;
		
		@FindBy(name="password") 
		WebElement password;
		
		@FindBy(xpath="//button/span[contains(text(),'Login')]") 
		WebElement loginbtn;
		
		@FindBy(xpath="//div[@class='title']")
		WebElement title;
		
		@FindBy(xpath="//div[@class='MuiAlert-message']")
		WebElement errorpop;
		
		public void setEmail(String emailtext) {
			email.sendKeys(emailtext);
		}
		
		public void setPassword(String passwordtext) {
			password.sendKeys(passwordtext);
		}
		
		public void Login() {
			loginbtn.click();
		}
		
		public String loginwithvalidcreds() {
			try {
				return title.getText();
			}
			catch(Exception e){
				return (e.getMessage());
			}
		}
		public String loginwithinvalidcreds() {
			try {
				return errorpop.getText();
			}
			catch(Exception e){
				return (e.getMessage());
			}
			
		}
		
	}
	


