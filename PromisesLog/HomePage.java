package PromisesLog;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseClassTest 
{
   String text="Enter Promise";
   @Test
   public void addPromise()
   {
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("promise/log_promise.php")).click();
	  
	  WebElement PromisForm = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name=\"cboEmp\"]")));
      Select s=new Select(PromisForm);
      s.selectByVisibleText("Sonali test");
      

      WebElement Promise = webdriverwait
              .until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPromise")));
      
      Promise.sendKeys(text);
      
      WebElement LogPromise = webdriverwait
              .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"btnSubmit\"]")));
      LogPromise.click();
      WebElement PromiseSucessfuly=webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"Promise added successfully\")]")));
      String bodyText2 = driver.findElement(By.xpath("//td[@align=\"center\"]/font")).getText();
	  Assert.assertTrue(bodyText2.contains("Promise added successfully"));
   }
   @Test
   public void  VerifyPromise()
   {
	   //Select promisor :Sonali test
	   WebElement Promisor = webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name=\"cboEmp\"]")));
	   Select s=new Select(Promisor);
	   s.selectByVisibleText("Sonali test");
	   
	   //Select Start date 
	   WebElement startDate= webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idImg1")));
	   startDate.click();
					
	   List<WebElement> allDates=driver.findElements(By.xpath("//table[contains(@style,\"visibility: visible;\")]/tbody/tr"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("9")) //also we can pass the dynamic vale of date
			{
				ele.click();
				break;
			}
			
		}
	   
		//Click on Search button
		WebElement search= webdriverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"Search\"]")));
		search.click();
		
		//Verify the Promise is added
		driver.findElement(By.xpath("//tr/td[contains(text(),'" + text + "')]")).isDisplayed();
		
		
   }
 
}
