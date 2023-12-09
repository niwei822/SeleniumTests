package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

	public static WebDriver getDriver(String browserName) {
		// driver = new FirefoxDriver();
		WebDriver driver = null;
		switch (browserName) {
		case "chrome":
			driver = CreateChromeDriver();
			break;
		case "firefox":
			driver = CreateFirefoxDriver();
			break;
		case "safari":
			driver = CreateSafariDriver();
			break;
		}
		return driver;
	}

	private static WebDriver CreateSafariDriver() {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		return driver;
	}

	private static WebDriver CreateFirefoxDriver() {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	private static WebDriver CreateChromeDriver() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
