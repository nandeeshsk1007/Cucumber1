package BackgroundPackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {

	@Given("user opens a browser")
	public void user_opens_a_browser() {
		System.out.println("Browser is launched");
	}

	@And("user enters login credentials")
	public void user_enters_login_credentials() {
		System.out.println("User filled login credentials");
	}

	@When("user clicks on send button")
	public void user_clicks_on_send_button() {
		System.out.println("User clicked on send button");
	}

	@Then("user navigates to home screen")
	public void user_navigates_to_home_screen() {
		System.out.println("User navigated to home screen");
	}

	@When("user clicks on profile icon")
	public void user_clicks_on_profile_icon() {
		System.out.println("User clicked on profile icon");
	}

	@Then("user verifies whether logout is displayed")
	public void user_verifies_whether_logout_is_displayed() {
		System.out.println("User verified logout button");
	}

	@When("user clicks on profile icon1")
	public void user_clicks_on_profile_icon1() {
		System.out.println("User clicked on profile icon1");
	}

	@Then("user verifies whether logout is displayed1")
	public void user_verifies_whether_logout_is_displayed1() {
		System.out.println("User verified logout button1");
	}
}