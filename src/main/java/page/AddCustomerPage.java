package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div/div[2]/div/div/header/div/strong") WebElement DASHBOARD_HEADER_ELEMENT; 
	
	
	
	
	
	
	
	
	
	
	
}
