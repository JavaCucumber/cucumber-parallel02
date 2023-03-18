package appRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(//tags = "@demo",
                 features = "src/test/resources/features",
                 glue = "appSteps",
                 plugin = {
                	                "pretty",
                	                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                	                "html:target/cucumber-reports/cucumberTestReport.html",
                	                "json:target/cucumber-reports/CucumberTestReport.json",
                	                "junit:target/cucumber-reports/CucumberTestReport.xml"

                	        }
                 )

public class CucumberRunnerTests  {

}