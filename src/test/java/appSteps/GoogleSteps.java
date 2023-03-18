package appSteps;

import appBase.TestSetUp;
import appPages.GoogleHome;
import appPages.PageManager;
import appPages.SearchResult;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GoogleSteps {

    TestSetUp setUp;
    public PageManager pageManager;

    public GoogleHome homePage;
    public SearchResult resultPage;


    public GoogleSteps(TestSetUp setUp)  {
        this.setUp = setUp;
        this.homePage = setUp.pageManager.getHomePage();
        this.resultPage= setUp.pageManager.getresultPage();
    }

    @Given("User is on google Home page")
    public void loginTest()  {
        setUp.baseTest.WebDriverManager().get("https://www.google.com/");

    }

    @When("User enters search {string}")
    public void goToHomePage(String search) throws InterruptedException {
    	homePage.enter_search(search);

    }

}