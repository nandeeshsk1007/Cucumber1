package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF {
	@FindBy (xpath = "//a[.='Log out']")
	WebElement logout_button;

	WebDriver driver;

	public HomePage_PF(WebDriver driver) {
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
		//PageFactory.initElements(driver, this);
	}

	public void logout() {
		logout_button.isDisplayed();
	}
}