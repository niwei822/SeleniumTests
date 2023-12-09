package Core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexBaseWebTest {
	protected WebDriver driver = null;
	
	@BeforeMethod
	public void setup() {
		driver = BrowserFactory.getDriver("chrome");
		driver.get("https://www.google.com");
	}
	
	
	@AfterMethod
	public void cleanUp() {
		driver.close();
	}

}
