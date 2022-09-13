package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
//    @RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature",
        glue = "StepDefination",
//            glue={"helpers","StepDefinition"},
        monochrome = true,
        tags = "@Android",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:allure-results/cucumber.html", "json:allure-results/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:failedTests/failed_scenarios.txt"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

