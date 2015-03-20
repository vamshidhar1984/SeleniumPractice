package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		/*
		// Method and Description - static DesiredCapabilities
		// internetExplorer()
		DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();

		// Method and Description - void setCapability(java.lang.String
		// capabilityName, boolean value)
		capabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);

		System.setProperty(
				"webdriver.ie.driver",
				"C:\\Users\\vamshidhar\\Downloads\\Development\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.close();
		*/
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
