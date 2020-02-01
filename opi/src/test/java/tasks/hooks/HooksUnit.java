package tasks.hooks;

import javax.inject.Inject;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import unitTest.TestedClass;
import utils.utils;

public class HooksUnit {

    @Inject
    public HooksUnit(TestedClass testedClass) {//tested method
        
    }

    @Before
    public void before() {
        log("ggg");
    }


    @After
    public void after() {
        log("kkkk");
    }
}
