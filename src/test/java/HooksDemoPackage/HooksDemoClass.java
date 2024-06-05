package HooksDemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoClass {
	
	WebDriver driver=null;
	
//	@Before
//	public void browserSetup() {
//		System.out.println("Executing browserSetup mathod");
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//	}
//	
//	@After
//	public void teardown() {
//		System.out.println("teardown method");
//		driver.quit();
//	}
//	
//	@BeforeStep
//	public void beforeStep() {
//		System.out.println("beforeStep");
//	}
//	
//	@AfterStep
//	public void afterStep() {
//		System.out.println("afterStep");
//	}
	
	@Given("step1")
	public void step1() {
		System.out.println("login page1");
	}
	
	@When("step2")
	public void step2() {
		System.out.println("login page2");
	}

	@And("step3")
	public void step3() {
		System.out.println("login page3");
	}

	@Then("step4")
	public void step4() {
		System.out.println("login page4");
	}
}
