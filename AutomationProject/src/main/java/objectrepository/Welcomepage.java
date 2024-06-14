package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	
	//initialize
	public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//declare
	@FindBy(linkText = "Log In")
	private WebElement LoginLink;
	//getters
	public WebElement getLoginLink() {
		return LoginLink;
	}
	
	
	
	

	

}
