package sauceDemoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SauceCheckoutCompletePage {
	
	@FindBy (xpath = "//*[@id=\"checkout_complete_container\"]/h2")
	public WebElement confirmation_message;
	
	public SauceCheckoutCompletePage(WebDriver driver) {
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
	}
}
