package PromisesLog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassTest {

	public static String URL = "http://182.74.238.221/clarion_promise_qa/home.php";
    public static String screenshotFileName = null;
 
    public WebDriver driver;// an API to send commands directly to the browser
    public WebDriverWait webdriverwait;
 
    @BeforeClass
    public void setupWebDriver() {
        System.setProperty("webdriver.chrome.driver","F:\\MyWorkspace\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        webdriverwait = new WebDriverWait(driver, 30);
 
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);
    }
 
    @AfterClass
    public void cleanup() {
        driver.close();
        driver.quit();
    }

  
}
