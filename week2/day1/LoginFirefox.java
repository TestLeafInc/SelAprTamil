package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFirefox {

	public static void main(String[] args) {
		
		/*
		 * Selenium Internal Architecture
		 * 
		 * Selenium Java Library <-> REST API <-> ChromeDriver <-> Chrome Browser
		 * (Java Binding)						  (Google)
		 * 
		 * Selenium Java Library <-> REST API <-> GeckoDriver <-> Firefox Browser
		 * (Java Binding)						  (Mozilla)
		 * 
		 * Selenium Java Library <-> REST API <-> EdgeDriver <-> Edge Browser
		 * (Java Binding)						  (Microsoft)
		 * 
		 * Selenium Java Library <-> REST API <-> SafariDriver <-> Safari Browser
		 * (Java Binding)						  (Apple)
		 * 
		 * Selenium C# Library <-> REST API <-> ChromeDriver <-> Chrome Browser
		 * (C# Binding)						    (Google)
		 */
		
		// Pre condition : Chrome Driver need to be downloaded and set to the path
		WebDriverManager.firefoxdriver().setup();
		
		// Step 1: Launch the chrome browser
		FirefoxDriver driver = new FirefoxDriver();
		
		// Step 2: URL load
		driver.get("http://leaftaps.com/opentaps");
		
		// Step 3: Maximize
		driver.manage().window().maximize();

	}

}















