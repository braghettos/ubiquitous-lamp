package it.insiel.innovazione.ipp.referenceapp.features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"html:target/cucumber-reports/CucumberTestReport.html", "json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/rerun.txt"},
        monochrome = true,
        dryRun = false)
public class CucumberIntegrationTest {

    @Test
    void emptyTest() {
        // This is intentional
    }
}
