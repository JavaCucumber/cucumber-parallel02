//package sharedata;
//
//import org.openqa.selenium.WebDriver;
//
//public class TestContext {
//	// private WebDriverManager webDriverManager;
//	private WebDriver driver;
//	private DriverManager driverManager;
//	private PageObjectManager pageObjectManager;
//	public ScenarioContext scenarioContext;
//	
//	public TestContext() throws Exception{
//		driverManager = new DriverManager();
//        //pageObjectManager = new PageObjectManager(DriverManager.getDriver());
//        pageObjectManager =new PageObjectManager(new DriverManager().initDriver("chrome"));
//		//baseDriver = new DriverManager();
//        // pageObjectManager = new PageObjectManager(driver);
//		scenarioContext = new ScenarioContext();
//	}
//	
//	public DriverManager getWebDriverManager() throws Exception {
//		return new DriverManager();
//	}
//	
//	public PageObjectManager getPageObjectManager() {
//		return pageObjectManager;
//	}
//	
//	public ScenarioContext getScenarioContext() {
//		return scenarioContext;
//	}
//
//}