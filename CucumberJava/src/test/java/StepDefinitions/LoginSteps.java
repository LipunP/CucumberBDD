package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	

	@Given("Login page")
	public void loginPage()
	{
		System.out.println("Login page shown");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters username and password");
	}

	@Then("user is navgated to the homepage")
	public void user_is_navgated_to_the_homepage() {
		System.out.println("Homepage shown");	
	}

}
