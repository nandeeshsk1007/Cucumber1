package sauceDemoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SauceLoginPage {


	@FindBy (name = "user-name")
	private WebElement username;

	@FindBy (name = "password")
	private WebElement password;

	@FindBy (name = "login-button")
	public WebElement loginbutton;

	@FindBy (xpath = "//h3[@data-test='error']")
	public WebElement errormessage;
	
	public SauceLoginPage(WebDriver driver)
	{
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
	}

	public void enterUAP() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
	}
	
	public void enterUAP1() {
		username.sendKeys("standard_user1");
		password.sendKeys("secret_sauce");
	}
	public void enterUAP2() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce1");
	}
}
