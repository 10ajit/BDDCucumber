package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Features/Customers.feature",
        glue = "StepDefination",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",
        		"html:target/HtmlReports/report.html",
        		"json:target/JsonReports/report.json",
        		"junit:target/JUnitReports/report.xml"
        		
        		
        }
)
public class Runner {
}
