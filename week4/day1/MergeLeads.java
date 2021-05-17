package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLeads {

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
		
		// Step 10: Click Merge Leads
		driver.findElement(By.linkText("Merge Leads")).click();
		
		// Step 11: Click on From Lead Icon
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
		
		// You need to switch to second window
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> lstWindowHandles = new ArrayList<String>(allWindowHandles);
		driver.switchTo().window(lstWindowHandles.get(1));
		
		// Type the lead id in the search
		driver.findElement(By.name("id")).sendKeys("10013");
		
		// Click on Search 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Wait for sometime
		Thread.sleep(2000);
		
		// Click on the first match
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		
		// Move the control back to the first window
		driver.switchTo().window(lstWindowHandles.get(0));
		
		// Click on To Lead Icon
		driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
		
		// You need to switch to second window
		allWindowHandles = driver.getWindowHandles();
		lstWindowHandles = new ArrayList<String>(allWindowHandles);
		driver.switchTo().window(lstWindowHandles.get(1));
		
		// Type the lead id in the search
		driver.findElement(By.name("id")).sendKeys("10014");
		
		// Click on Search 
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		// Wait for sometime
		Thread.sleep(2000);
		
		// Click on the first match
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		
		// Move the control back to the first window
		driver.switchTo().window(lstWindowHandles.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}















