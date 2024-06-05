package sauceDemoPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SauceProductsPage {
	@FindBy (xpath = "//div[@class='inventory_list']/div")
	public List<WebElement> productslist;
	
	@FindBy (xpath = "//div[@class='inventory_list']/div/div[2]/div[2]/button")
	public List<WebElement> add_to_cart_count;
	
	@FindBy (xpath = "//div[@class='inventory_list']/div/div[2]/div[2]/div")
	public List<WebElement> price;
	
	@FindBy (xpath = "//div[@class='inventory_list']/div/div[2]/div[1]/a/div")
	public List<WebElement> title;
	
	@FindBy (xpath = "//div[@class='inventory_list']/div/div[1]")
	public List<WebElement> image;
	
	@FindBy (className = "product_sort_container")
	public WebElement filter;
	
	@FindBy (xpath = "//option[@value='az']")
	public WebElement az;
	
	@FindBy (xpath = "//option[@value='za']")
	public WebElement za;
	
	@FindBy (xpath = "//option[@value='lohi']")
	public WebElement lohi;
	
	@FindBy (xpath = "//option[@value='hilo']")
	public WebElement hilo;
	
	@FindBy (xpath = "//div[@class='inventory_list']/div/div[2]/div[2]/button")
	public List<WebElement> cart_button;
	
	@FindBy (xpath = "//*[@id='shopping_cart_container']/a")
	public WebElement cart_icon;
	
	public static WebDriver driver;
	
	public SauceProductsPage(WebDriver driver) {
		AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax, this);
	}
}
