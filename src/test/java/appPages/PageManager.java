package appPages;

import org.openqa.selenium.WebDriver;
import appBase.ScenarioContext;

public class PageManager {

	public WebDriver driver;
	public GoogleHome homePage;
	public SearchResult resultPage;
   
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
	
	
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
    
//	public Faker getFakeData() {
////		fakeData = new Faker();
////		return fakeData;
//	}
}