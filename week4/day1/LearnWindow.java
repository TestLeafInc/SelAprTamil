package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

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
		
		// Check what is the current window handle
		System.out.println(driver.getWindowHandle());
		
		// Click Open Home Page
		driver.findElement(By.id("home")).click();
		
		// Print the number of windows open
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles.size());
		
		// Where is the control? -> control will be the window 1 unless moved
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// How to get the second window from the Set
		List<String> lstWindows = new ArrayList<String>(allWindowHandles);
		
		// Get the second window handle
		String secondWindowHandle = lstWindows.get(1);
		
		// Move the control to the second window
		driver.switchTo().window(secondWindowHandle);
		
		// Confirm the title and current URL
		System.out.println("Moved? "+driver.getTitle());
		System.out.println("Moved? "+driver.getCurrentUrl());
		
		// close window
		/*driver.close();
		
		// switch to first window
		driver.switchTo().window(secondWindowHandle);
		
		// close first window
		driver.close();*/
		
		// Close all opened browser in present session
		driver.quit();
		
		
		
		
		
		
	}

}
