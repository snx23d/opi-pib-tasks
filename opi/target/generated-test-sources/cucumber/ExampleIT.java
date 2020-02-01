import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"f:/opib/opi-pib-tasks/opi/src/test/resources/features/example.feature:8"},
plugin = {"json:target/cucumber-reports/1.json"},
monochrome = false,
glue = { "tasks" })
public class ExampleIT {
}
