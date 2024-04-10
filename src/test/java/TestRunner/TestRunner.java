package TestRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/Login.feature",
        glue="StepDefinitions",
        dryRun=false,
        plugin = {"pretty","html:test_output"}
)
public class TestRunner {

}
