package sauceDemoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SauceAddressPage {
public static WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"first-name\"]")
	public WebElement firstname_field;
	
	@FindBy (xpath = "//*[@id=\"last-name\"]")
	public WebElement lastname_field;
	
	@FindBy (xpath = "//*[@id=\"postal-code\"]")
	public WebElement pincode_field;
	
	@FindBy (xpath = "//*[@id=\"continue\"]")
	public WebElement continue_button;
	
	public SauceAddressPage(WebDriver driver) {
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
	}
	
	public void submitAddress() {
		firstname_field.sendKeys("Name");
		lastname_field.sendKeys("lastname");
		pincode_field.sendKeys("561956");
		continue_button.click();
	}
}
