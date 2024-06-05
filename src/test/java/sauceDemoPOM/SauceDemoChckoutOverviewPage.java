package sauceDemoPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SauceDemoChckoutOverviewPage {
public static WebDriver driver;
	
	@FindBy (xpath = "//div[@class='cart_item']/div/div/div")
	public List<WebElement> price_on_check_screen;

	@FindBy (xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
	public WebElement total_price;
	
	@FindBy (xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
	public WebElement item_total;
	
	@FindBy (xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
	public WebElement grand_total;
	
	@FindBy (xpath = "//*[@id=\"finish\"]")
	public WebElement finish_button;

	public SauceDemoChckoutOverviewPage(WebDriver driver) {
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
	}
}