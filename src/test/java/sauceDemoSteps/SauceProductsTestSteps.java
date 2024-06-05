package sauceDemoSteps;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauceDemoPOM.SauceProductsPage;

public class SauceProductsTestSteps {
	private WebDriver driver;
	private SauceProductsPage productspage;
	private int no_of_products;
	private String[] st;
	
	
	@Then("Check the number of products available on the page")
	public void check_the_number_of_products_available_on_the_page() {
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		no_of_products = productspage.productslist.size();
		System.out.println(no_of_products);
	}

	@Then("Check all the products have title")
	public void check_all_the_products_have_title() {
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		int expected_title_count=6;
		System.out.println(productspage.price.get(0).getText());

		Assert.assertEquals("Products count is not matching as expecting.", expected_title_count, productspage.title.size());
	}

	@Then("check all the products have add to cart button")
	public void check_all_the_products_have_add_to_cart_button() {
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		int expected_cart_count=6;
		Assert.assertEquals("Cart button missed for a product.", expected_cart_count, productspage.add_to_cart_count.size());
	}

	@Then("check all the products have a image")
	public void check_all_the_products_have_a_image() {
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		int expected_image_count=6;
		Assert.assertEquals("Product image not missed for a product.", expected_image_count, productspage.image.size());
	}

	@Then("user clicks on a product and verifies he has navigated to detailed screen")
	public void user_clicks_on_a_product_and_verifies_he_has_navigated_to_detailed_screen() {
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		for(int i=0; i<productspage.title.size(); i++) {
			driver = SauceLoginTestSteps.getDriver();
			productspage=new SauceProductsPage(driver);
			String title = productspage.title.get(i).getText();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);", productspage.title.get(i));
			productspage.title.get(i).click();
			WebElement pd_title = driver.findElement(By.xpath("//div[@class='inventory_details_container']/div[2]/div[1]"));
			pd_title.isDisplayed();
			System.out.println(pd_title.getText().equals(title));
			driver.findElement(By.xpath("//*[@id='back-to-products']")).click();
		}
	}

	@When("user clicks on filter button and selects az option")
	public void user_clicks_on_filter_button_and_selects_az_option() throws InterruptedException {
		Thread.sleep(2000);
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		productspage.filter.click();
		productspage.az.click();

	}

	@Then("check all the products are displaying in alphabetical order")
	public void check_all_the_products_are_displaying_in_alphabetical_order() {
		st = new String[productspage.title.size()];
		for(int i=0; i<productspage.title.size(); i++) {

			st[i]=productspage.title.get(i).getText();
		}

		for (int j = 0; j<st.length-1; j++) {
			if(st[j].compareTo(st[j+1])>0) {
				System.out.println(st[j]+" is not in correct order");
			}
			else {
				System.out.println(st[j]+" is in correct order");
			}
		}
		
	}
	@When("user clicks on filter button and selects za option")
	public void user_clicks_on_filter_button_and_selects_za_option() throws InterruptedException {
		Thread.sleep(2000);
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		productspage.filter.click();
		productspage.za.click();
	}

	@Then("check all the products are displaying in reverse alphabetical order")
	public void check_all_the_products_are_displaying_in_reverse_alphabetical_order() {
		st = new String[productspage.title.size()];
		for(int i=0; i<productspage.title.size(); i++) {

			st[i]=productspage.title.get(i).getText();
		}

		for (int j = 0; j<st.length-1; j++) {
			if(st[j].compareTo(st[j+1])<0) {
				System.out.println(st[j]+" is not in correct order");
			}
			else {
				System.out.println(st[j]+" is in correct order");
			}
		}
		
	}

	@When("user clicks on filter button and selects lohi option")
	public void user_clicks_on_filter_button_and_selects_lohi_option() throws InterruptedException {
		Thread.sleep(2000);
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		productspage.filter.click();
		productspage.lohi.click();
	}

	@Then("check all the products are displaying in low to higher price")
	public void check_all_the_products_are_displaying_in_low_to_higher_price() {
		Double[] st1 = new Double[productspage.price.size()];
		for(int i=0; i<productspage.price.size(); i++) {
			StringBuilder strng = new StringBuilder(productspage.price.get(i).getText());
			strng.deleteCharAt(0);
			String strng1 = strng.toString();
			double double1 = Double.parseDouble(strng1);
			st1[i]=double1;
		}

		for (int j = 0; j<st1.length-1; j++) {
			
			if(st1[j]>(st1[j+1])) {
				System.out.println(st1[j]+" is not in correct order");
			}
			else {
				System.out.println(st1[j]+" is in correct order");
			}
		}
	}

	@When("user clicks on filter button and selects hilo option")
	public void user_clicks_on_filter_button_and_selects_hilo_option() throws InterruptedException {
		Thread.sleep(2000);
		driver = SauceLoginTestSteps.getDriver();
		productspage=new SauceProductsPage(driver);
		productspage.filter.click();
		productspage.hilo.click();
	}

	@Then("check all the products are displaying in high to low price")
	public void check_all_the_products_are_displaying_in_high_to_low_price() {
		Double[] st1 = new Double[productspage.price.size()];
		for(int i=0; i<productspage.price.size(); i++) {
			StringBuilder strng = new StringBuilder(productspage.price.get(i).getText());
			strng.deleteCharAt(0);
			String strng1 = strng.toString();
			double double1 = Double.parseDouble(strng1);
			st1[i]=double1;
		}

		for (int j = 0; j<st1.length-1; j++) {
			
			if(st1[j]<(st1[j+1])) {
				System.out.println(st1[j]+" is not in correct order");
			}
			else {
				System.out.println(st1[j]+" is in correct order");
			}
		}
		
	}
}