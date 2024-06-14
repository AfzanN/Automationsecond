package genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;

import org.testng.ITestResult;

public class Listenersutility extends Baseclass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getName();//this is to capture method name
		
		
	         TakesScreenshot ts = (TakesScreenshot)driver;  
	         File temp = ts.getScreenshotAs(OutputType.FILE);
	         File dest = new File("./screenshots/"+methodname+".png");// after given filehandler.copy you will get try and catch
	         try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	         
	         
	         
	}
}
	       