package SWQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Test1 {
	public static WebDriver driver=null;
	public static WebElement alert=null;
	public static WebDriverWait wait=null;
	 
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver",
					"F:\\MyWorkspace\\chromedriver_win32\\chromedriver.exe");
			this.driver = new ChromeDriver();
			
	  }

	  
	  public void alertClick( WebElement alert ) throws Exception {
		  Thread.sleep(3000);
			 alert.click();
			 Thread.sleep(3000);
			 //printing alert message
			 System.out.println("alert message :"+driver.switchTo().alert().getText());
			 //clik on ok button
			 driver.switchTo().alert().accept();
			 // cancel button
			 //driver.switchTo().alert().dismiss();
			 
		               
		     
	  }
}