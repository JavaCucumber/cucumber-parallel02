package appSteps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import appBase.TestSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class TestHooks {

	public TestSetUp setUp;

	public TestHooks(TestSetUp setUp) {
        this.setUp = setUp;
    }

    @After
    public void tearDown( )  {
        setUp.baseTest.WebDriverManager().quit();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {

       // WebDriver driver =  setUp.baseTest.WebDriverManager();
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) setUp.baseTest.WebDriverManager()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }

    }
}
