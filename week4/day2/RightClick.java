package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("https://dev103117.service-now.com/");

		// Step 3: Maximize
		driver.manage().window().maximize();

		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Switch to the frame
		driver.switchTo().frame("gsft_main");
		
		// Login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		
		// Filter Navigator 
		driver.findElement(By.id("filter")).sendKeys("incident");
		
		// Click on All from Incident
		driver.findElementByXPath("//span[text()='Incident']/following::div[text()='All']").click();
		
		// Switch to frame
		driver.switchTo().frame("gsft_main");
		
		// Right click on the first row
		WebElement ele1 = driver.findElement(By.xpath("//td[text()='Unable to connect to email']"));
		
		Actions builder = new Actions(driver);
		builder.contextClick(ele1).perform();
		
		// Click Filter Out
		driver.findElement(By.xpath("//div[text()='Filter Out']")).click();
		
		
		
		
		
		
		
		
		











	}

}
