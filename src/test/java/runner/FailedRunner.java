package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@rerun/failedscenarios.txt"},
		glue = {"stepdefinitions","AppHooks"},
		tags="@smoke and not @skip",
		plugin = {"pretty"},
		publish = true
		)
public class FailedRunner {

}
