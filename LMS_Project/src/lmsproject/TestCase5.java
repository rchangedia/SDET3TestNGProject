package lmsproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase5 {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","//home//reshma//chromedriver");
		
		  driver = new ChromeDriver();
		  //Open Browser
		  driver.get("https://alchemy.hguy.co/lms/");
		  driver.manage().window().maximize();		
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  }	  
  
  @Test
  public void myAccount() {
	  
	  driver.findElement(By.linkText("My Account")).click();
	  String title = driver.getTitle();
      System.out.println("Page title is: " + title);
      String expectedText = "My Account – Alchemy LMS";
      Assert.assertEquals(title , expectedText);
      
  }
  
  @AfterMethod
  public void afterMethod(){

      driver.quit();
  }
}
