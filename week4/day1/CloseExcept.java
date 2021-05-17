package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseExcept {

	public static void main(String[] args) {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("http://leafground.com/pages/Window.html");

		// Step 3: Maximize
		driver.manage().window().maximize();

		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Store the primary Window
		String primary = driver.getWindowHandle();

		// Click Do not close me
		driver.findElement(By.xpath("//button[@id='color']")).click();

		// Print the number of windows open
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		
		for (String eachWindowHandle : allWindowHandles) {
			if(!eachWindowHandle.equals(primary)) {
				driver.switchTo().window(eachWindowHandle);
				driver.close();
			}
		}




	}

}
