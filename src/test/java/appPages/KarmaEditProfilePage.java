package appPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KarmaEditProfilePage {
	
	WebDriver driver;

	public KarmaEditProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

//    driver.findElement(By.xpath("//input[@value='+91 12345-67890']")).click();
//   
//    driver.findElement(By.id("rc_select_27")).click();
//    driver.findElement(By.name("jobTitle")).click();
//    driver.findElement(By.name("jobCompany")).click();
//    driver.findElement(By.xpath("//div[@id='layoutContentWrapper']/div/div/div/div/div/div/div[2]/form/div[9]/button/span")).click();
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Changes saved'])[1]/following::*[name()='svg'][1]")).click();
//	
	
	@FindBy(xpath="//a[contains(text(),'Profile')]")
	public WebElement profileLink;
	
	@FindBy(name="firstName")
	public WebElement editFIrstName;
	
	@FindBy(name="lastName")
	public WebElement editLastName;
	
	@FindBy(name="email")
	public WebElement editEmail;
	
	@FindBy(name="bio")
	public WebElement editAboutMe;
	
	@FindBy(name="jobTitle")
	public WebElement editJobTitle;
	
	@FindBy(name="jobCompany")
	public WebElement editCompany;

	@FindBy(xpath="//button[@data-qa='user-info-form_save-changes-button']")
	public WebElement editProfileSaveChangeBtn;

//	@FindBy(xpath=)
//	public WebElement ;
//
//	@FindBy(xpath=)
//	public WebElement ;
//
//	@FindBy()
//	public WebElement ;

	
	String AboutMe = "About The User python devloper";
	
	public void enterAboutMeData(String text) {
		editAboutMe.clear();
		editAboutMe.sendKeys(text);
	}
	
	public void clickSaveChanges() throws InterruptedException {
		scrollIntoView(editProfileSaveChangeBtn);
		editProfileSaveChangeBtn.click();
		
	}
	
	public void clickProfileLink() throws InterruptedException {
		scrollIntoView(profileLink);
		profileLink.click();
	}
	
	
	public void scrollIntoView(WebElement e) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoViewIfNeeded()", e);
		Thread.sleep(500);
	}
	
	
	
	
	
}
