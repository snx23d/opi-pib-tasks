package tasks.hooks;

import javax.inject.Inject;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class HooksSelenium {

    private final WebDriver driver;

    @Inject
    public HooksSelenium(final WebDriver driver) {
        this.driver = driver;
    }

    @Before
    public void openWebSite() {
        driver.manage().window().maximize();
        driver.navigate().to("http://www.google.com");

    }

    @After
    public void closeSession() {
        driver.close();
    }
}
