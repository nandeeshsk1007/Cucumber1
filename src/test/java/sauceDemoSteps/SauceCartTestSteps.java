package sauceDemoSteps;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauceDemoPOM.SauceCartPage;
import sauceDemoPOM.SauceProductsPage;

public class SauceCartTestSteps {

	private WebDriver driver;
	private SauceProductsPage productspage;
	LinkedList<String> products_to_add_to_cart;
	private SauceCartPage cartpage;


	@When("user adds required product to cart")
	public void user_adds_required_product_to_cart() {
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		products_to_add_to_cart = new LinkedList<String>();
		products_to_add_to_cart.add("Sauce Labs Backpack");
		//products_to_add_to_cart.add("Test.allTheThings() T-Shirt (Red)");
		products_to_add_to_cart.add("Sauce Labs Fleece Jacket");

		for(String in:products_to_add_to_cart) {
			for(int i=0; i<productspage.title.size(); i++) {
				if(productspage.title.get(i).getText().equals(in)) {
					productspage.cart_button.get(i).click();
				}
			}
		}
	}

	@And("user clicks on cart icon to navigate to cart screen")
	public void user_clicks_on_cart_icon_to_navigate_to_cart_screen() {
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		productspage.cart_icon.click();
	}

	@Then("user verifies all the cart products")
	public void user_verifies_all_the_cart_products() throws InterruptedException {
		driver = SauceLoginTestSteps.getDriver();
		cartpage=new SauceCartPage(driver);
		for(WebElement items:cartpage.cart_items) {
			if(products_to_add_to_cart.contains(items.getText())) {
				System.out.println(items.getText()+" is available in cart");
			}
			else {
				System.out.println(items.getText()+" is not availble in cart");
			}
		}
		cartpage.continue_shoping.click();
		Thread.sleep(5000);
		for(String in:products_to_add_to_cart) {
			for(int i=0; i<productspage.title.size(); i++) {
				if(productspage.title.get(i).getText().equals(in) && productspage.add_to_cart_count.get(i).getText().contains("Remove")) {
					System.out.println(productspage.title.get(i).getText()+" product already in cart");
				}
				else if (productspage.title.get(i).getText().equals(in) && productspage.add_to_cart_count.get(i).getText().contains("Add to cart")) {
					System.out.println(in+" Add to cart");
				}
			}
		}
	}
	@AfterEach
	public void tearDown() {
		driver = SauceLoginTestSteps.getDriver();
		driver.quit();
	}
}
