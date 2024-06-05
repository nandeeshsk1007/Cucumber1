package sauceDemoSteps;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauceDemoPOM.SauceAddressPage;
import sauceDemoPOM.SauceCartPage;
import sauceDemoPOM.SauceCheckoutCompletePage;
import sauceDemoPOM.SauceDemoChckoutOverviewPage;

public class SauceCheckoutTestSteps {

	private WebDriver driver;
	private SauceCartPage cartpage;
	private SauceAddressPage addresspage;
	private SauceDemoChckoutOverviewPage checkoutoverviewpage;
	private double fdouble;

		
	@When("user clicks on checkout button")
	public void user_clicks_on_checkout_button() {
		driver = SauceLoginTestSteps.getDriver();
		cartpage=new SauceCartPage(driver);
		cartpage.checkout_button.click();
	}

	@And("user fills delivery address")
	public void user_fills_delivery_address() {
		driver = SauceLoginTestSteps.getDriver();
		addresspage=new SauceAddressPage(driver);
		addresspage.submitAddress();
	}

	@And("user verifies the product and total price to pay and clicks on finish button")
	public void user_verifies_the_product_and_total_price_to_pay_and_clicks_on_finish_button() {
		driver = SauceLoginTestSteps.getDriver();
		checkoutoverviewpage=new SauceDemoChckoutOverviewPage(driver);
		for(WebElement price:checkoutoverviewpage.price_on_check_screen) {
			StringBuilder stng = new StringBuilder(price.getText());
			stng.deleteCharAt(0);
			String stng1 = stng.toString();
			double fprice = Double.parseDouble(stng1);
			fdouble = fdouble+fprice;
		}
		double expected_result = 95.97;
		Assert.assertEquals("Total price mismatching", fdouble, fdouble, 0.0);

		StringBuilder itemtotal = new StringBuilder(checkoutoverviewpage.item_total.getText());
		for(int i=0; i<13; i++) {
			itemtotal.deleteCharAt(0);
		}
		String stng2 = itemtotal.toString();
		double itotal = Double.parseDouble(stng2);
		Assert.assertEquals("Item total mismatch", itotal, fdouble, 0.0);

		double tax_for_item_total = itotal*0.08;
		double grand_total_price = itotal+tax_for_item_total;
		double round_total_price = Math.round(grand_total_price*100.0)/100.0;
		StringBuilder stng = new StringBuilder(checkoutoverviewpage.grand_total.getText());
		for(int i=0; i<8; i++) {
			stng.deleteCharAt(0);
		}
		String stng3 = stng.toString();
		double gtotal = Double.parseDouble(stng3);
		Assert.assertEquals(round_total_price, gtotal, 0.0);
		
		checkoutoverviewpage.finish_button.click();
	}

	@Then("user verifies order confirmation message which is displayed on the screen")
	public void user_verifies_order_confirmation_message_which_is_displayed_on_the_screen() {
		driver=SauceLoginTestSteps.getDriver();
		SauceCheckoutCompletePage checkoutcomplete = new SauceCheckoutCompletePage(driver);
		String confirmation_message = checkoutcomplete.confirmation_message.getText();
		Assert.assertEquals("Confirmation message is not as per the requirement", confirmation_message, "Thank you for your order!");
		
	}
}
