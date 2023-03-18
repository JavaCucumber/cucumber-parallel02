package appSteps;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import appBase.Context;
import appBase.ScenarioContext;
import appBase.TestSetUp;
import appPages.KarmaDashboardPage;
import appPages.KarmaPage;
import appPages.PageManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KarmaSteps {

	TestSetUp setUp;
	public PageManager pageManager;
	public KarmaPage karmaPage;
	public KarmaDashboardPage karmaDashboardPage;
	public ScenarioContext scenarioContext;

	public KarmaSteps(TestSetUp setUp) {
		this.setUp = setUp;
		this.karmaPage = setUp.pageManager.getKarmaPage();
		this.karmaDashboardPage=setUp.pageManager.getkarmaDashboardPage();
		this.scenarioContext = setUp.pageManager.scenarioContext;
	}

	@Given("^user on career karma homepage$")
	public void user_on_career_karma_homepage() throws Throwable {
		karmaPage.gotToKarmaApp();
	}

	@And("close matched pop")
	public void close_matched_popup() {

	}

	@When("^user click on signin link$")
	public void user_click_on_signin_link() throws Throwable {
		karmaPage.click_signIn();
		waitForPageLoad();
	}

	@Then("^user navigates to signin page$")
	public void user_navigates_to_signin_page() throws Throwable {
          Assert.assertEquals(karmaPage.verifySignInPage(), true);
	}

	@When("^click on signup link$")
	public void click_on_signup_link() throws Throwable {
		karmaPage.gotoSignUp();
	}

	@Then("^new signup page displayed$")
	public void new_signup_page_displayed() throws Throwable {

	}

	@When("^enter enter signup form data to fields$")
	public void enter_enter_signup_form_data_to_fields(DataTable tableData) throws Throwable {
		List<List<String>> rows = tableData.asLists(String.class);
		System.out.println("data in rows:" + rows.size());

		for (List<String> columns : rows) {
			System.out.println("email data: " + columns.get(0));
			scenarioContext.setContext(Context.KARMA_NEWUSER_EMAIL, columns.get(0));
			setUp.userEmail = setUp.fake.internet().emailAddress(); // columns.get(0);
			karmaPage.newuser(columns.get(0), columns.get(1), columns.get(2), columns.get(3));

		}
	}

	@And("^click on signup button$")
	public void click_on_signup_button() throws Throwable {
		// throw new PendingException();
	}

	@When("enter new user email")
	public void enterNewEmail() {
		System.out.println("new user email: " + scenarioContext.getContext(Context.KARMA_NEWUSER_EMAIL));
		System.out.println("new user email: " + setUp.getNewUserEmail());
	}

	@When("enter user credentails {string} and {string}")
	public void f1(String p0, String p1) throws InterruptedException {
		karmaPage.SignInUser(p0, p1);
	}

	@And("click signin button")
	public void f2() {

	}

	//

	@When("user login to karma app")
	public void x1() throws InterruptedException {
		karmaPage.SignInUser("max1234@yopmail.com","Test@1234");
		waitForPageLoad();
	}

	@Then("successfully logged in to app")
	public void x2() throws InterruptedException {
		karmaDashboardPage.verifyDashBoardPage();
		Thread.sleep(5000);
	}

	@When("user goto to mypost section using user avtar")
	public void x3() throws InterruptedException {
		karmaDashboardPage.goToMyPostPage();
		waitForPageLoad();
	}

	@Then("sucessfully navigates to mypost page")
	public void x4() {
		Assert.assertEquals(karmaDashboardPage.verifyMyPostPage(),true);        
	}

	@When("click on create post button")
	public void x5() throws InterruptedException {
		karmaDashboardPage.click_createPostBtn();
		waitForPageLoad();
	}

	@Then("user navigates to mypost page")
	public void x6() throws InterruptedException {
		Assert.assertEquals(karmaDashboardPage.verifyMyPostPage(),true);
		
		Thread.sleep(5000);
	}
	
	public void waitForPageLoad() throws InterruptedException {
		JavascriptExecutor  js = (JavascriptExecutor)setUp.baseTest.WebDriverManager();
		int count=0;
		for(int i=0;i<15;i++) {
			if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		        System.out.println("Page loaded completely..."); 
				break; 
		    }
			Thread.sleep(2000);
		}
	}
	
	
	
	
	
}
