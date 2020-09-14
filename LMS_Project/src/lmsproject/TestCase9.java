package lmsproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase9 {
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
	  driver.findElement(By.linkText("Login")).click();
      driver.findElement(By.id("user_login")).sendKeys("root");
      driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
      driver.findElement(By.id("wp-submit")).click();
      driver.findElement(By.xpath("//span[contains(text(),'Social Media Marketing')]")).click();
      driver.findElement(By.xpath("//div[contains(text(),'Monitoring & Digital Advertising')]")).click();
      Assert.assertEquals(driver.getTitle(), "Monitoring & Digital Advertising – Alchemy LMS");
      driver.findElement(By.className("learndash_mark_complete_button")).click();
          
      
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  

    }
}


//course ": class name - ld-item-title"
//mark complete :class name= learndash_mark_complete_button