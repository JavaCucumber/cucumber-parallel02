package appBase;

import com.github.javafaker.Faker;

import appPages.PageManager;

public class TestSetUp {


    public PageManager pageManager;
    public BaseTest baseTest;
    //public ScenarioContext scenarioContext;
    public static String userEmail;
    public Faker fake;
    
    public TestSetUp()  {

        baseTest = new BaseTest();
        pageManager = new PageManager(baseTest.WebDriverManager());
        fake = new Faker();
    }
    
    public String getNewUserEmail() {
    	return userEmail;
    }
}