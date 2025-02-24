package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin = {
                "pretty",
                "html:build/reports/tests/test/index.html", // HTML Report
                "json:build/cucumber-reports/cucumber.json"  // JSON Report
        },
        tags = "@api or @web"
)
public class TestRunner {
}
