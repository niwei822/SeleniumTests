package Core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class introduction {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
        driver.get("https://www.google.com");
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.close();
	}
//	@Test
//	public void TestwithTextInput() throws InterruptedException {
//		// TODO Auto-generated method stub
//		
//		//System.setProperty("webdriver.chrome.driver", "/Users/cecilyli/Documents/chromedriver");
//        
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("popular books");
//        
//        Thread.currentThread();
//		Thread.sleep(2000);
//        
//        WebElement searchBtn = driver.findElement(By.name("btnK"));
//        searchBtn.click();
//        
//        Assert.assertEquals(driver.getTitle(), "popular books - Google Search");
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com")); 
//
//	}
	
	@Test
	public void TestwithCorrectLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/cecilyli/Documents/chromedriver");
        
        WebElement mail = driver.findElement(By.linkText("Gmail"));
        mail.click();
        WebElement signin = driver.findElement(By.linkText("Sign in"));
        signin.click();
        //#identifierId
        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("c18244510@gmail.com");
        Thread.currentThread();
		Thread.sleep(2000);
        WebElement next = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        next.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));

        WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
        pw.sendKeys("Test@123");
        WebElement next2 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
        next2.click();
        
        Thread.currentThread();
		Thread.sleep(2000);
        
        
        Assert.assertEquals(driver.getTitle(), "Inbox - c18244510@gmail.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("https://mail.google.com")); 

	}

}
