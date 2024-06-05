package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps {

	public WebDriver driver=null;

	@Given("user opens the browser")
	public void user_opens_the_browser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}

	@And("user open the app")
	public void user_open_the_app() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enters un and pwd")
	public void user_enters_un_and_pwd() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed();
		driver.quit();
	}
	
}
