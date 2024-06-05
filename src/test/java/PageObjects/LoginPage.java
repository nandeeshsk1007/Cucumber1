package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;
	
	By username_field = By.id("username");
	By password_field = By.id("password");
	By login_button = By.id("submit");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		if (!driver.getCurrentUrl().equals("https://practicetestautomation.com/practice-test-login/")) {
			throw new IllegalStateException("This is not the Login screen"+driver.getCurrentUrl());
		}
	}
	
	public void username(String username) {
		driver.findElement(username_field).sendKeys(username);
	}
	public void password(String password) {
		driver.findElement(password_field).sendKeys(password);
	}
	public void Login() {
		driver.findElement(login_button).click();
	}
}
