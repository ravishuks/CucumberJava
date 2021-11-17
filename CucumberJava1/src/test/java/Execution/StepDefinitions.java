package Execution;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Step#1- User is on the Login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("Step#2- User enters the username and password in the login page");
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
	    System.out.println("Step#3- User clicks on the Login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    System.out.println("Step#4- user is successfully navigated to the home page");
	}

}
