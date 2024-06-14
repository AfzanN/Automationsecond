package login;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericutility.Fileutility;

public class Demo1 {
	
	@Test
	public void test() throws IOException {
		
		Fileutility fLib = new Fileutility();
		String URL = fLib.getDatafromproperty("url");
		System.out.println(URL);
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		
		
		
	 
		
	}

}
