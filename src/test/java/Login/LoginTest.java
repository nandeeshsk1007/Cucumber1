package Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	@Given("User is on the Login screen")
	public void user_is_on_the_login_screen() {
		System.out.println("User is on the Login page-----------");
	}

	@When("User enters UN and PWD")
	public void user_enters_un_and_pwd() {
		System.out.println("User enters UN and PWD----------");
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		System.out.println("Click on Login button");
	}

	@Then("User is navigated to Home screen")
	public void user_is_navigated_to_home_screen() {
		System.out.println("User is navigated to Home screen");
	}
}
