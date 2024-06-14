package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Webdriverutility {
	
	public void doubleclick (WebDriver driver, WebElement Element) {
		
		Actions act = new Actions(driver);
		act.doubleClick(Element).perform();
		
		
		
	}
	
public void clickandhold (WebDriver driver, WebElement Element) {
		
		Actions act = new Actions(driver);
		act.clickAndHold(Element).perform();
		
}

public void draganddrop (WebDriver driver, WebElement Element) {
	
	Actions act = new Actions(driver);
	act.dragAndDrop(Element, Element).perform();

}}
