package appSteps;

import appBase.TestSetUp;
import appPages.PageManager;
import io.cucumber.java.en.Given;

public class CommonSteps {

	TestSetUp setUp;
    public PageManager pageManager;

    public CommonSteps(TestSetUp setUp)  {
        this.setUp = setUp;

    }

    @Given("user navigates {string} to url")
    public void navig_to(String url) {
    	setUp.baseTest.WebDriverManager().navigate().to(url);
    }
}
