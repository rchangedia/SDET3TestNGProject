package lmsproject;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCase7 {
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
  public void Countcourses() {
	driver.findElement(By.id("menu-item-1508")).click();
	WebElement allcourses=driver.findElement(By.id("ld_course_list"));
	List<WebElement> course = allcourses.findElements(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']//h3"));
	System.out.println("Total Number of Course = " + course.size());
		for (WebElement printcourse : course) 
		{

			System.out.println(printcourse.getText());
			
		}
  
	  
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
}
