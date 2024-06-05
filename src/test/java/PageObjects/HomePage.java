package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
By logout_button = By.xpath("//a[.='Log out']");
protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		if (!driver.getCurrentUrl().equals("https://practicetestautomation.com/logged-in-successfully/")) {
			throw new IllegalStateException("This is not Home screen"+driver.getCurrentUrl());
		}
	}
	
	public void logout() {
		driver.findElement(logout_button).isDisplayed();
	}
}
