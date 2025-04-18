package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        tags = "@StatementFilterDownload", // ✅ Pehle Login run hoga phir BalanceView
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class LoginRunner {
}
