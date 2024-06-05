package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoStepsWithMulDataSetsPOM {
//	WebDriver driver=null;
//	private LoginPage loginpage;
//
//	@Given("user launches a browser")
//	public void user_launches_a_browser() {
//		WebDriverManager.firefoxdriver().setup();
//		driver=new FirefoxDriver();
//	}
//
//	@And("user opens the app")
//	public void user_opens_the_app() {
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_un_and_pwd(String un, String pwd) throws InterruptedException {
//		loginpage = new LoginPage(driver);
//		loginpage.username(un);
//		loginpage.password(pwd);
//	}
//
//	@And("user clicks on the login button")
//	public void user_click_on_login_the_button() throws InterruptedException {
//		loginpage.Login();
//	}
//
//	@Then("user navigates to Home screen")
//	public void user_navigates_to_Home_screen() {
//		HomePage homepage = new HomePage(driver);
//		homepage.logout();
//		driver.quit();
//	}
}
