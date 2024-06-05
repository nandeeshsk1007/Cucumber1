package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	
	@FindBy (id = "username")
	WebElement username_field;
	
	@FindBy (how = How.ID, using = "password")
	WebElement password_field;
	
	@FindBy (id = "submit")
	WebElement login_button;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
		//PageFactory.initElements(driver, this);
	}
	
	public void username(String username) {
		username_field.sendKeys(username);
	}
	public void password(String password) {
		password_field.sendKeys(password);
	}
	public void login() {
		login_button.click();
	}
}
