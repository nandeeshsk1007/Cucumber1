package sauceDemoSteps;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import sauceDemoPOM.SauceLoginPage;

public class SauceLoginTestSteps {

	public static WebDriver driver;

	SauceLoginPage loginpage;

	
	@SuppressWarnings("deprecation")
	@Given("^user launches browser$")
	public void user_launches_browser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("^user enters respective url into the search field$")
	public void user_enters_respective_url_into_the_search_field() {
		driver.get("https://www.saucedemo.com/");
	}

	@Then("^user navigates to login screen$")
	public void user_navigates_to_login_screen() {
	}

	@When("^user enters username and password into the respective fields$")
	public void user_enters_username_and_password_into_the_respective_fields() {
		loginpage = new SauceLoginPage(driver);
		loginpage.enterUAP();
	}

	@And("^user clicks on the login button1$")
	public void user_clicks_on_the_login_button1() {
		loginpage.loginbutton.click();
		
	}

	@Then("^user navigates to products screen$")
	public void user_navigates_to_products_screen() {
		driver.navigate().back();
	}

	@When("^user enters invalid iusername and valid password into the respective fields$")
	public void user_enters_invalid_iusername_and_valid_password_into_the_respective_fields() {
		
		loginpage = new SauceLoginPage(driver);
		loginpage.enterUAP1();
	}

	@Then("^user gets proper error message for invalid username$")
	public void user_gets_proper_error_message_for_invalid_username() {

		Assert.assertEquals("Error1 message is not as per the requirements", "Epic sadface: Username and password do not match any user in this service", loginpage.errormessage.getText());
		
	}

	@When("^user enters valid username and invalid ipassword into the respective fields$")
	public void user_enters_valid_username_and_invalid_ipassword_into_the_respective_fields() {
		driver.navigate().refresh();
		loginpage = new SauceLoginPage(driver);
		loginpage.enterUAP2();
	}

	@Then("^user gets proper error message for invalid password$")
	public void user_gets_proper_error_message_for_invalid_password() {
		Assert.assertEquals("Error3 message is not as per the requirements", "Epic sadface: Username and password do not match any user in this service", loginpage.errormessage.getText());
		
	}
	
	@When("^user clicks on login button without filling username and password fields$")
	public void user_clicks_on_login_button_without_filling_username_and_password_fields() {
		driver.navigate().refresh();
		loginpage = new SauceLoginPage(driver);
		loginpage.loginbutton.click();
	}

	@Then("^user gets proper error message for empty fields$")
	public void user_gets_proper_error_message_for_empty_fields() throws InterruptedException {
		Assert.assertEquals("Error2 message is not as per the requirements", "Epic sadface: Username is required", loginpage.errormessage.getText());
		Thread.sleep(2000);
		
	}

	

	public static WebDriver getDriver() {
		return driver;
	}
	@Then("^user closes browser$")
	public void user_closes_browser() {
		driver.quit();
	}
}
