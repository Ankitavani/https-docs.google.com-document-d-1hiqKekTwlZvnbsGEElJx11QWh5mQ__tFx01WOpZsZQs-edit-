package PromisesLog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseClassTest {
	      @Test 
	      public void InValidloginUser() 
	      { 
		  WebElement username=driver.findElement(By.name("txtUsername")); 
		  WebElement password=driver.findElement(By.name("txtPassword")); 
		  WebElement login=driver.findElement(By.xpath("//input[@value=\"Login\"]")); 
		  username.sendKeys(" "); 
		  password.sendKeys(" "); 
		  login.click(); 
		  String bodyText = driver.findElement(By.xpath("//td[@align=\"center\"]/font")).getText();
		  Assert.assertTrue(bodyText.contains("Invalid Username/password"));
		  }
          
	      @Test
	      public void ValidUser()
	      {
	      WebElement username=driver.findElement(By.name("txtUsername")); 
		  WebElement password=driver.findElement(By.name("txtPassword")); 
		  WebElement login=driver.findElement(By.xpath("//input[@value=\"Login\"]")); 
	      username.sendKeys("sanjeetk@clariontechnologies.co.in"); 
		  password.sendKeys("clarion"); 
		  login.click();
	      }
	      
	      }      


