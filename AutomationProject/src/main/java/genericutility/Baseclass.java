package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.Homepage;
import objectrepository.Loginpage;
import objectrepository.Welcomepage;

public class Baseclass {

	public Fileutility fLib;
	public WebDriver driver;
	public Loginpage lp;
	public Welcomepage wp;
	public Homepage hp;

	@BeforeClass
	public void test() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fLib = new Fileutility();
		String URL = fLib.getDatafromproperty("url");
		driver.get(URL);
	}

	@BeforeMethod
	public void login() throws IOException {
		wp = new Welcomepage(driver);
		wp.getLoginLink().click();
		lp = new Loginpage(driver);
		String EMAIL = fLib.getDatafromproperty("email");
		String PASSWORD = fLib.getDatafromproperty("password");
		lp.getEmailtextfeild().sendKeys(EMAIL);
		lp.getPasswordtextfield().sendKeys(PASSWORD);
		lp.getLoginButton().click();
	}

	@AfterMethod
	public void logout() {
		hp = new Homepage(driver);
		hp.getBookslink().click();
		hp.getLogoutlink().click();
	}

	@AfterClass
	public void Closebrowser() {
		driver.quit();

	}

}
