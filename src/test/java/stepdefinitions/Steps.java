package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("The user is on the login page");
    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Entered valid username and passwords");
    }
    @When("hits Submit")
    public void hits_submit() {
        System.out.println("Clicked on Submit");
    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("I am logged in");
    }
}
