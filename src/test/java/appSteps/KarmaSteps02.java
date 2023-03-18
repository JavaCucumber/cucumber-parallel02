package appSteps;

import org.openqa.selenium.JavascriptExecutor;

import appBase.ScenarioContext;
import appBase.TestSetUp;
import appPages.KarmaDashboardPage;
import appPages.KarmaEditProfilePage;
import appPages.KarmaPage;
import appPages.PageManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KarmaSteps02 {
	
	TestSetUp setUp;
	public PageManager pageManager;
	public KarmaPage karmaPage;
	public KarmaDashboardPage karmaDashboardPage;
	public KarmaEditProfilePage editProfilePage;
	public ScenarioContext scenarioContext;

	public KarmaSteps02(TestSetUp setUp) {
		this.setUp = setUp;
		this.karmaPage = setUp.pageManager.getKarmaPage();
		this.karmaDashboardPage=setUp.pageManager.getkarmaDashboardPage();
		this.editProfilePage = setUp.pageManager.getEditProfilePage();
				
		this.scenarioContext = setUp.pageManager.scenarioContext;
	}

    @Given("sign in to karma app")
    public void f1() throws InterruptedException {
    	karmaPage.gotToKarmaApp();
    	karmaPage.click_signIn();
    	karmaPage.SignInUser("max1234@yopmail.com","Test@1234");
    	karmaDashboardPage.verifyDashBoardPage();
    	karmaDashboardPage.goToMyPostPage();
    }
    
    @When("click on edit profile button on profile page")
    public void f2() throws InterruptedException {
    	karmaDashboardPage.click_editProfileBtn();
    	waitForPageLoad();
    }
    
    @Then("user navigates to edit profile page")
    public void f3() throws InterruptedException {
    	Thread.sleep(5000);
    }
    
    @When("enter {string} in about me feild")
    public void f4(String p01) throws InterruptedException {
    	setUp.fake.job().keySkills();
    	editProfilePage.enterAboutMeData(p01+" "+setUp.fake.job().keySkills());
    }
    
    @And("click on save changes button")
    public void f5() throws InterruptedException {
    	editProfilePage.clickSaveChanges();
    	waitForPageLoad();
    }
    
    @And("click on profile link")
    public void f6() throws InterruptedException {
    	editProfilePage.clickProfileLink();
    	waitForPageLoad();
    }
    
    @Then("verify about me should displayed")
    public void f7() throws InterruptedException {
    	Thread.sleep(5000);
    	System.out.println(karmaDashboardPage.getUserProfileCardAboutMeText());
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
