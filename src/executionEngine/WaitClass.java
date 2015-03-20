package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {
	
	public static WebDriver driver;
	
	public static void main(String arg[]){
		
		driver = new FirefoxDriver();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='timingAlert']")).click();;
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		try{
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		 
        System.out.println("Either Pop Up is displayed or it is Timed Out");
  
        myAlert.accept();
		}catch(Exception e){
			System.out.println("Exception occured" + e.getLocalizedMessage());
			
		}
        System.out.println("Alert Accepted");
 
        driver.close();
		
	}

}
