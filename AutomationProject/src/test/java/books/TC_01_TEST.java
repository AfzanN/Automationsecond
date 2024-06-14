package books;



import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import objectrepository.Homepage;


public class TC_01_TEST extends Baseclass
{
	
	@Test
	public  void clickonbooks() {
	
	
	hp=new Homepage(driver);
	hp.getBookslink().click();
	Reporter.log("Books",true);
		
		
	
	

	}
}
