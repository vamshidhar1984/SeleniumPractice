package executionEngine;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Log4jSample {
	
	public static WebDriver driver;
	
	public static void main(String args[]){
		
		// Provide Log4j configuration settings
		DOMConfigurator.configure("log4j.xml");
		
		//Log log = new Log();
		Log.startTestCase("Testcase1");
		
		// Create a new instance of the Firefox driver
		Log.info("Create a new instance of the Firefox driver");			 
        driver = new FirefoxDriver();
        
 
        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        Log.info("Put an Implicit wait, this means that any search for elements on the page could "
        		+ "take the time the implicit wait is set for before throwing exception");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        // Launch the URL
        Log.info("Launch the URL");
        driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
 
        // Click on the Button "Timing Alert"
        Log.info("Click on the Button Timing Alert");
        driver.findElement(By.xpath("//*[@id='timingAlert']")).click();
 
        System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
 
        // Create new WebDriver wait
        Log.info("Create new WebDriver wait");
        WebDriverWait wait = new WebDriverWait(driver, 10);
 
        // Wait for Alert to be present
        Log.info("Wait for Alert to be present");
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
 
        System.out.println("Either Pop Up is displayed or it is Timed Out");
 
        // Accept the Alert
        Log.info("Accept the Alert");
        myAlert.accept();
 
        System.out.println("Alert Accepted");
 
        // Close the main window
        Log.info("Close the main window");
        driver.close();
        
        Log.endTestCase("Testcase1");
		
	}

}
