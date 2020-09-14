package lmsproject;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase1 {
	WebDriver driver;
	 
  @BeforeMethod
  public void beforeMethod(){
     
	System.setProperty("webdriver.chrome.driver","//home//reshma//chromedriver");
		
	driver = new ChromeDriver();
	  //Open Browser
	  driver.get("https://alchemy.hguy.co/lms/");
	  driver.manage().window().maximize();		
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  }
      
  @Test
  public void exampleTestCase() {
	  
	  String title = driver.getTitle();
		
      System.out.println("Page title is: " + title);
	
      Assert.assertEquals("Alchemy LMS – An LMS Application", title);

}
  
  @AfterMethod
  public void afterMethod(){

      driver.quit();
  }

}
