package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	
	String userName = "demo@codefios.com";
	String password = "abc123";
	String dashboardHeaderPage = "Dashboard";

	@Test
	public void validUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertpassword(password);
		loginPage.clickSigninButton();
		
		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		Assert.assertEquals(dashBoardPage.validateDashboardPage(), dashboardHeaderPage,"dashboard not found!");
	
		BrowserFactory browserFactory = new BrowserFactory();
		browserFactory.tearDown();
	}
	
	
	
	
	
	
}
