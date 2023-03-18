package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {

	WebDriver driver;

	public GoogleHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(name="q")
	public WebElement searchBox;

	public void enter_search(String x) throws InterruptedException {
		searchBox.sendKeys(x+"\n");
		Thread.sleep(5000);
	}
}
