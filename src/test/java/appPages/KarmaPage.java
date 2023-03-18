package appPages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KarmaPage {
	WebDriver driver;

	public KarmaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String baseURL = "https://careerkarma.com/";
    String signInPageTitle="Login | Career Karma";
	
	
	
	
	
	// home page
	@FindBy(xpath = "//div[@data-qa='get-matched-modal']")
	private WebElement matchedModelBox;

	@FindBy(xpath = "//span[@class='ant-modal-close-x']")
	private WebElement matchedCloseBtn;

	@FindBy(xpath = "//div[contains(text(),'Sign in')]")
	private WebElement signInLink;

	// sign-in page
	@FindBy(xpath = "//input[@placeholder='E-mail']")
	private WebElement userEmail;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement userPwTxt;

	@FindBy(xpath = "//button[@data-qa='sign-in-form_sign-in-btn']")
	private WebElement signInBtn;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	private WebElement signUpLink;
    
	//sign-up page
	@FindBy(xpath = "//input[@type='email']")
	private WebElement newEmailTxt;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement newPasswordTxt;

	@FindBy(xpath = "//input[@name='confirmedPassword']")
	private WebElement rePasswordTxt;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstNameTxt;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastNameTxt;

	@FindBy(xpath = "//button[@data-qa='sign-up-form_sign-up-btn']")
	private WebElement signUpBtn;

//    @FindBy(xpath=)
//    private WebElement 

	public void gotToKarmaApp() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(6000);

		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(matchedModelBox));
		matchedCloseBtn.click();
	}

	public void click_signIn() throws InterruptedException {
		signInLink.click();
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(signUpLink));

	}
	
	public boolean verifySignInPage() {
		return new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.titleIs(signInPageTitle));
	}

	public void gotoSignUp() {
		signUpLink.click();
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(newEmailTxt));
	}

	public void newuser() throws InterruptedException {
		newEmailTxt.click();
		newPasswordTxt.click();
		rePasswordTxt.click();
		firstNameTxt.click();
		lastNameTxt.click();
		signUpBtn.click();
		Thread.sleep(5000);
	}

	public void newuser(String newmail, String pw, String fname, String lname) throws InterruptedException {
		newEmailTxt.sendKeys(newmail);
		newPasswordTxt.sendKeys(pw);
		rePasswordTxt.sendKeys(pw);
		firstNameTxt.sendKeys(fname);
		lastNameTxt.sendKeys(lname);
		signUpBtn.click();
		Thread.sleep(5000);
	}

	public void SignInUser(String email, String pw) throws InterruptedException {
		userEmail.sendKeys(email);
		userPwTxt.sendKeys(pw);
		signInBtn.click();
		Thread.sleep(7000);
	}
	
	public void scrollIntoView(WebElement e) throws InterruptedException {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoViewIfNeeded()", e);
		Thread.sleep(500);
	}
}
