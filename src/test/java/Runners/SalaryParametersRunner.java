package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/SalaryParameters.feature"},
        glue = "StepDefinitions"
)

public class SalaryParametersRunner extends AbstractTestNGCucumberTests {
}
