package Login;

import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	private FirefoxDriver driver;

	@Given("User opens a browser")
	public void user_opens_a_browser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	@And("Enters a text into the search field")
	public void enters_a_text_into_the_search_field() {
			System.out.println("Text entered into the field.");
	}

	@When("User clicks Enter Key")
	public void user_clicks_enter_key() {
		System.out.println("The Enter key has been clicked.");
	}

	@Then("User navigates to search results page")
	public void user_navigates_to_search_results_page() {
		System.out.println("User got related information.");
	}
}
