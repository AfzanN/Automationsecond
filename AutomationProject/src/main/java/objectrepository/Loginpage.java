package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//initialize
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//declare
	
	@FindBy (id = "Email")
	public WebElement emailtextfeild;
	
	@FindBy (id = "Password")
	public WebElement passwordtextfield;
	
	@FindBy (xpath = "//input[@value='Log in']")
	public WebElement loginButton;
	//getter

	public WebElement getEmailtextfeild() {
		return emailtextfeild;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

	

}
