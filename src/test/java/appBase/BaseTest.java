package appBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public final static int TIMEOUT = 10;

	public WebDriver WebDriverManager() {

		if (driver == null) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-notifications");
			chromeOptions.addArguments("--remote-allow-origins=*");
			chromeOptions.addArguments("--log-level=3");
			chromeOptions.addArguments("--silent");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			// driver.get(url);

		}
		return driver;
	}
}