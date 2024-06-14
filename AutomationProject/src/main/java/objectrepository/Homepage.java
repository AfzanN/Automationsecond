package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
		
	}
	
	@FindBy (partialLinkText  = "Books" )
	public WebElement Bookslink;
	
	@FindBy (linkText = "Log out")
	public WebElement Logoutlink;
	
	

	public WebElement getLogoutlink() {
		return Logoutlink;
	}



	public WebElement getBookslink() {
		return Bookslink;
	}
	
	
	

}
