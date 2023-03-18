package appPages;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import appBase.ScenarioContext;

public class PageManager {

	public WebDriver driver;
	public GoogleHome homePage;
	public SearchResult resultPage;
    public KarmaPage  karmaPage;
    public KarmaDashboardPage karmaDashboardPage;
    public KarmaEditProfilePage editProfilePage;
    public ScenarioContext scenarioContext;
    
    
	public PageManager(WebDriver driver) {
		this.driver = driver;
		 scenarioContext =new ScenarioContext();
		 
	}

	public GoogleHome getHomePage() {

		homePage = new GoogleHome(driver);
		return homePage;
	}

	public SearchResult getresultPage() {
		resultPage = new SearchResult(driver);
		return resultPage;
	}
	
	public KarmaPage getKarmaPage() {
		karmaPage = new KarmaPage(driver);
		return karmaPage;
	}
	
	public KarmaDashboardPage getkarmaDashboardPage() {
		
		karmaDashboardPage =new KarmaDashboardPage (driver);
		return karmaDashboardPage ;
	}
	
	public KarmaEditProfilePage getEditProfilePage() {
		editProfilePage = new KarmaEditProfilePage (driver);
		return editProfilePage;
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
    
//	public Faker getFakeData() {
////		fakeData = new Faker();
////		return fakeData;
//	}
}