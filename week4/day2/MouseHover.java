package week4.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("https://www.flipkart.com/");

		// Step 3: Maximize
		driver.manage().window().maximize();
		
		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Click the X button
		driver.findElementByXPath("//button[text()='✕']").click();
		
		// Find the element
		WebElement eleElectronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		// Mouse Over on the electronics
		Actions builder = new Actions(driver);
		builder.moveToElement(eleElectronics).perform();
		
		// Health & Personal Care
		WebElement eleHealthCare = driver.findElementByLinkText("Health & Personal Care");
		builder.moveToElement(eleHealthCare).perform();
		
		//Hair Dryers
		driver.findElementByLinkText("Hair Dryers").click(); 
		
		/*
		Actions builder = new Actions(driver);
		builder.pause(Duration.ofSeconds(2))
			   .moveToElement(driver.findElement(By.xpath("//div[text()='Electronics']")))
			   .pause(Duration.ofSeconds(2))
			   .moveToElement(driver.findElementByLinkText("Health & Personal Care"))
			   .pause(Duration.ofSeconds(2))
			   .click(driver.findElementByLinkText("Hair Dryers"))
			   .perform(); */
		
		
		// Verify that you are in correct page
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
