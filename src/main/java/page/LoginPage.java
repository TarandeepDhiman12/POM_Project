package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	

//	WebElement USER_NAME_ELEMENT1 = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));

	@FindBy(how = How.XPATH, using = "//*[@id=\"user_name\"]")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]")
	WebElement SIGNIN_BUTTON_ELEMENT;

	public LoginPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	// individual
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}

	public void insertpassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
		;
	}

	// combine method

	public void login(String userName, String password) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();

	}

}
