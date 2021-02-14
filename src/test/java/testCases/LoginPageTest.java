package testCases;

import java.sql.SQLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.DataBasePage;
import page.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpageObj;
	
	@BeforeMethod
	 public void setUp() {
	  initializeDriver();
	  loginpageObj = PageFactory.initElements(driver, LoginPage.class);
	 }
	
	@Test
	public void LoginTest() throws InterruptedException, ClassNotFoundException, SQLException {
	
		loginpageObj.enterUserName(DataBasePage.getData("userName"));
		loginpageObj.enterPassword(DataBasePage.getData("password"));
		loginpageObj.clickSignInButton();
		Thread.sleep(3000);
	}
	
	
	
	@AfterMethod
	 public void tearDown() {  
	  driver.close();
	  driver.quit();
	 }
}
