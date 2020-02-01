package tasks.acceptancetests;


import org.junit.runner.RunWith;
import utils.utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"tasks"},
        features = ".",
        format = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        tags = {"@complete"}

)
public class AllTests {

        // @Before
        void ggg(){
                utils.log("ggg");
        }

        // @Test
        // void fff() {
        //         utils.log("fff");
        // }

        // @After
        // void hhh(){
        //         utils.log("hhh");
        // }

        
}