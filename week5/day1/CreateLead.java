package week5.day1;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseTest{
	
	/*
	 * thread-count (XML) -> how many test cases to run in parallel?
	 * threadPoolSize (@Test) -> only when you are using invocationCount
	 * 		-> this is only for single test case 
	 * 
	 */
	// invocationCount = 10, threadPoolSize = 2
	// timeOut = 5000, dependsOnMethods 
	// enabled -> false and @Ignore
	// priority 
	
	
	
	@Test()
	public void createLead() throws InterruptedException {
		
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hariharan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Radhakrishnan");
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
