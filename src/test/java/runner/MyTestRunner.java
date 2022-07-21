package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"stepdefinitions","AppHooks"},
		tags="@smoke and not @skip",
		plugin = {"pretty",
				"rerun:rerun/failedscenarios.txt",
				"timeline:test-output-thread/"},
		publish = true
		)
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
public class MyTestRunner {

}
