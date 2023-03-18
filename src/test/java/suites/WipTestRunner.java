package suites;

import org.junit.runner.RunWith;

import courgette.api.CourgetteOptions;
import courgette.api.CourgettePlugin;
import courgette.api.CourgetteRunLevel;
import courgette.api.CourgetteTestOutput;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 1,
        runLevel = CourgetteRunLevel.FEATURE,
        rerunFailedScenarios = false,
        testOutput = CourgetteTestOutput.CONSOLE,
        reportTargetDir = "target",
        classPath = {"target/libs/*", "target/test-classes/"},
        plugin = CourgettePlugin.EXTENT_REPORTS,
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/features",
                glue = "appSteps",
                tags = {"@karma_wip", "not @excluded"},
                publish = true,
                plugin = {
                        "pretty",
//                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                        "json:target/cucumber-report/cucumber.json",
                        "html:target/cucumber-report/cucumber.html",
                        "junit:target/cucumber-report/cucumber.xml"}
        ))

public class WipTestRunner {

}
