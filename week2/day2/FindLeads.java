package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLeads {

	public static void main(String[] args) throws InterruptedException {
				
		// Pre condition : Chrome Driver need to be downloaded and set to the path
		WebDriverManager.chromedriver().setup();
		
		// Step 1: Launch the chrome browser
		//WebElement
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: URL load
		driver.get("http://leaftaps.com/opentaps");
		
		// Step 3: Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 4: Find the username and type the value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Step 5: Find the password and type the value
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Step 6: Find the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Step 7: Verify that you logged in
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		// Step 8: Click CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Step 9: Click on the Leads Tab Link
		driver.findElement(By.linkText("Leads")).click();
		
		// Step 10: Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		// Step 11: Click Phone Tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		// Step 12: Enter the Phone number
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("999999999");
		
		// Step 13: Click on Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Sleep
		Thread.sleep(2000);
		
		// Step 14: Click on the first match
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		
		
		
	}

}















