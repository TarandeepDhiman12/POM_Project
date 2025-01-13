package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class AddCustomerPage {

	
	WebDriver driver;
	String fullname = "asdfghnmjhgfr";
	String companyName = "aaaa111";
	
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
 
	@FindBy(how =How.XPATH, using ="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong") WebElement NEW_CUSTOMER_HEADER_ELEMENT;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"general_compnay\"]/div[1]/div/input") WebElement ADD_FULL_NAME_ELEMENT;
	
	@FindBy (how = How.XPATH , using ="//*[@id=\"general_compnay\"]/div[2]/div/span/span[1]/span" ) WebElement  ADD_COMPANY_NAME_ELEMENT ;
	
	public String validateAddCustomerPage() {
		String actualText = NEW_CUSTOMER_HEADER_ELEMENT.getText();
		return actualText;
		}
	
	public void insertFullName() {
		
		ADD_FULL_NAME_ELEMENT.sendKeys(fullname);
	}
	
	public void insertCompanyName() {
		
		ADD_COMPANY_NAME_ELEMENT.sendKeys(companyName);
		
	}
	
}
