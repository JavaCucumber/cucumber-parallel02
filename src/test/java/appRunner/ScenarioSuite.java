//package appRunner;
//
//import courgette.api.CourgetteOptions;
//import courgette.api.CourgetteRunLevel;
//import courgette.api.CourgetteTestOutput;
//import courgette.api.CucumberOptions;
//import courgette.api.junit.Courgette;
//import org.junit.runner.RunWith;
//
//@RunWith(Courgette.class)
//@CourgetteOptions(
//        threads = 2,
//        runLevel = CourgetteRunLevel.FEATURE,
//        rerunFailedScenarios = true,
//        testOutput = CourgetteTestOutput.CONSOLE,
//        reportTargetDir = "target",
//        cucumberOptions = @CucumberOptions(
//                features = "src/test/resources/features",
//                glue = "appSteps",
//                tags = {"@demo", "not @excluded"},
//                publish = true,
//                plugin = {
//                        "pretty",
//                        "json:target/cucumber-report/cucumber.json",
//                        "html:target/cucumber-report/cucumber.html",
//                        "junit:target/cucumber-report/cucumber.xml"}
//        ))
//public class ScenarioSuite {
//}
