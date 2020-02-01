package tasks.steps;

import javax.inject.Inject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
// import cucumber.api.java.en.When;
// import cucumber.api.java.en.And;
// import cucumber.api.java.en.But;

import unitTest.TestedClass;
import unitTest.Generator;

import org.junit.Assert;



public class StepsUnit {

    @Inject
    private TestedClass testedClass;//tested method

    @Given("^I run the method with empty list$")
    public void i_run_the_method_with_empty_list() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I get the empty list back$")
    public void i_get_the_empty_list_back() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^I run the method with complete list$")
    public void i_run_the_method_with_complete_list() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I get the list with only even numbers$")
    public void i_get_the_list_with_only_even_numbers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}