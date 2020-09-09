package SWQA;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 extends Test1 {

	
	@Test
	public void HandleAlerts() throws Exception {

		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),\"Alerts, Frame & Windows\")]"));
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/span[text()='Alerts']\"")));
		driver.findElement(By.xpath("//li/span[text()='Alerts']"));
		
		
		
		//Alert Handling
		for(int i=1;i>=4;i++)
		{		
		alert = driver.findElement(By.xpath("(//div/button[text()='Click me'])"));
        
		alertClick(alert);
		}
		
		//Frame Handle
		driver.findElement(By.xpath("//div[text()=\"Frames\"]")).click();
		driver.switchTo().frame("frame1");
		String text=driver.findElement(By.id("sampleHeading")).getText();
		Assert.assertEquals("This is a sample page",text);
		driver.switchTo().defaultContent();
		
                  @AfterTest
		  public void afterTest() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  driver.close();
		
		
	}
}

