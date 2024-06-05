package sauceDemoPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SauceCartPage {
	
	@FindBy (xpath = "//div[@class='cart_item']/div/a/div")
	public List<WebElement> cart_items;
	
	@FindBy (xpath = "//*[@id=\"continue-shopping\"]")
	public WebElement continue_shoping;
	
	@FindBy (xpath = "//*[@id='checkout']")
	public WebElement checkout_button;
	
public static WebDriver driver;
	
	public SauceCartPage(WebDriver driver) {
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
	}
}
