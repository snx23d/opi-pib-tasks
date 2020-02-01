package tasks.steps;

import javax.inject.Inject;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

public class StepsSelenium {

    @Inject
    private WebDriver webDriver;

    @Given("^jjjI search for \"([^\"]*)\"$")
    public void gggi_search_for(String arg1) {
    }

    @Then("^hhhI google should show me results!$")
    public void gggi_google_should_show_me_results() {
    }
}