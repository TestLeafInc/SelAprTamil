package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
				
		// Pre condition : Chrome Driver need to be downloaded and set to the path
		WebDriverManager.chromedriver().setup();
		
		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: URL load
		driver.get("http://leaftaps.com/opentaps");
		
		// Step 3: Maximize
		driver.manage().window().maximize();
		
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
		
		// Step 9: Click Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Step 10: Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		// Step 11: Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Babu");
		
		// Step 12: Enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manickam");
		
		
		// Step 12a: Choose the source as Partner
		
		
		
		// Step 13: Click Create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		// Step 14: Verify the title
		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Testcase Passed");
		} else {
			System.err.println("Testcase failed");
		}
		
		// Step 15: Get the text of the created lead
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text2);
		
		// Get only the number
		String leadNumber = text2.replaceAll("\\D", "");
		System.out.println(leadNumber);
		
		// Step 16: Close the browser
		driver.close();
		
	}

}















