package week4.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOf {

	public static void main(String[] args) {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("http://leafground.com/pages/appear.html");

		// Step 3: Maximize
		driver.manage().window().maximize();

		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Get the element
		WebElement ele = driver.findElement(By.id("btn"));
		
		// Wait for the element to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele)); // polling -> 500 ms
		
		// Check if the element exist
		System.out.println(ele.isDisplayed());
		
		
		
		
		
		











	}

}
