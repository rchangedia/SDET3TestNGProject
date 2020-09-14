package lmsproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase8 {
	WebDriver driver;
  @Test
  public void Contact() {
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	  driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Reshma");
	  driver.findElement(By.id("wpforms-8-field_1")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("wpforms-8-field_2")).sendKeys("test");
	  driver.findElement(By.id("wpforms-submit-8")).click();
	  String Actualtext= driver.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us! We will be in touch with')]")).getText();
	  String expectedText= "Thanks for contacting us! We will be in touch with you shortly.";
	  Assert.assertEquals(Actualtext, expectedText);
		  
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","//home//reshma//chromedriver");
	  driver = new ChromeDriver();
		  //Open Browser
	  driver.get("https://alchemy.hguy.co/lms/");
	  driver.manage().window().maximize();		
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }
	  
 

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
}

}
