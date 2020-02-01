package tasks.steps;

import javax.inject.Inject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

import unitTest.TestedClass;

import static org.junit.Assert.assertEquals;



public class StepsUnit {

    @Inject
    private TestedClass testedClass;//tested method

    @Given("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {
    }

    @Then("^I google should show me results!$")
    public void i_google_should_show_me_results() {
    }
}