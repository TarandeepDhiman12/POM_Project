package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	String userName = "demo@codefios.com";
	String password = "abc123";
	String dashboardHeaderPage = "Dashboard";

	@Test
	public void validUserShouldBeAbleToAddCustomer() {

		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login(userName, password);

		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		Assert.assertEquals(dashBoardPage.validateDashboardPage(), dashboardHeaderPage, "dashboard not found!");
		dashBoardPage.clickOnCustomer();
		dashBoardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage();
		addCustomerPage.insertFullName();
		addCustomerPage.insertCompanyName();
		

	}

}
