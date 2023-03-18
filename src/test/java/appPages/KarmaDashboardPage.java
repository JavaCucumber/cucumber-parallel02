package appPages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KarmaDashboardPage {

	WebDriver driver;

	public KarmaDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String userDashBoardTitle = "FastTrack Dashboard | Career Karma";

	@FindBy(xpath = "//div[@data-qa='user-avatar_avatar']")
	private WebElement userAvtar;

	// avtar-options
	@FindBy(xpath = "//a[@data-qa='user-section-links_logout']")
	private WebElement avtar_logout;

	@FindBy(xpath = "//a[@data-qa='user-section-links_settings']")
	private WebElement avtar_settings;

	@FindBy(xpath = "//a[@data-qa='user-section-links_my-posts']")
	private WebElement avtar_myposts;

	@FindBy(xpath = "//a[@data-qa='user-section-links_my-questions']")
	private WebElement avtar_myquestions;

	@FindBy(xpath = "//a[@data-qa='user-section-links_followed-discussions']")
	private WebElement avtar_discussion;

	// mypost-page
	String userMyPostTitle = "Profile - Just Starting | Career";

	@FindBy(xpath = "//button[@data-qa='action-button_create-post-btn']")
	private WebElement createPostXpath;

	@FindBy(xpath = "//span[contains(text(),'Create first post')]")
	private WebElement createFirstPostXpath;

	@FindBy(xpath = "//button[@data-qa='user-profile-card_edit-profile-btn']")
	private WebElement editProfileBtn;
    
	@FindBy(xpath="//div[@data-qa='user-profile-card_user-card']/div/div[2]/div/p")
	private WebElement profileCardText;
	
	
	
	
	
	public boolean verifyDashBoardPage() {
		return new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.titleIs(userDashBoardTitle));
	}

	public void goToMyPostPage() throws InterruptedException {
		new Actions(driver).moveToElement(userAvtar).pause(Duration.ofMillis(600)).build().perform();
		avtar_myposts.click();

	}

	public boolean verifyMyPostPage() {
		return new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.titleContains(userMyPostTitle));
	}

	public void click_createPostBtn() throws InterruptedException {
		scrollIntoView(createPostXpath);
		createPostXpath.click();
		Thread.sleep(5000);
	}

	// create-post page
	String createPostTitle = "Create post | Career Karma";

	public boolean verifyCreatePostPage() {
		return new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.titleIs(createPostTitle));
	}

	public void verifyNoTextPresent() {
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.invisibilityOf(profileCardText));
	}
	
	public String getUserProfileCardAboutMeText() {
		return profileCardText.getText();
	}
	public void click_editProfileBtn() throws InterruptedException {
		scrollIntoView(editProfileBtn);
		editProfileBtn.click();

	}

	public void scrollIntoView(WebElement e) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoViewIfNeeded()", e);
		Thread.sleep(500);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
