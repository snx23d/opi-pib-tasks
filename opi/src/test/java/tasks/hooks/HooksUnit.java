package tasks.hooks;

import javax.inject.Inject;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import unitTest.TestedClass;

public class HooksUnit {

    @Inject
    public HooksUnit(TestedClass testedClass) {//tested method
        
    }

    @Before
    public void openWebSite() {
    }

    @After
    public void closeSession() {

    }
}
