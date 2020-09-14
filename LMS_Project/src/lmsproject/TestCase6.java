package lmsproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase6 {
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
	      driver.findElement(By.linkText("Login")).click();
	      driver.findElement(By.id("user_login")).sendKeys("root");
	      driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	      driver.findElement(By.id("wp-submit")).click();
	      Assert.assertTrue(isElementPresent(By.xpath("//a[@class='ld-logout ld-logout ld-login-text ld-login-button ld-button']")));

	  }
	  
	  private boolean isElementPresent(By xpath) {
		// TODO Auto-generated method stub
		return true;
	}

	@AfterMethod
	  public void afterMethod(){

	      driver.quit();
	  }
}