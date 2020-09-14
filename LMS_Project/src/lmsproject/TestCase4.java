package lmsproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase4{
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
  public void getSecondCourse() {
	     WebElement secondCourse = driver.findElement(By.className("caption"));
		 String actualText=driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]")).getText();
		 System.out.println("Second course:"  + actualText);
		 String expectedText="Email Marketing Strategies";
		 Assert.assertEquals(actualText,expectedText);
		     
}
  
  @AfterMethod
  public void afterMethod(){

      driver.quit();
  }

}

