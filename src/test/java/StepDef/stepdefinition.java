package StepDef;

import java.time.Duration;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
static WebDriver driver;
	@Given("I want to login")
	public void i_want_to_login() {
driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://d16j7f8mrd9efq.cloudfront.net/auth/login");
	}

	@When("I complete action")
	public void i_complete_action() {

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

	}

	@Then("check more outcomes")
	public void check_more_outcomes() {

	}

}
