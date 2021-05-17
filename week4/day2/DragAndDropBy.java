package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropBy {

	public static void main(String[] args) {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("https://jqueryui.com/draggable/");

		// Step 3: Maximize
		driver.manage().window().maximize();
		
		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Switch to the frame
		driver.switchTo().frame(0);
		
		// Find the element
		WebElement eleDraggable = driver.findElement(By.id("draggable"));
		
		// What is the current position of the element
		Point location = eleDraggable.getLocation();
		int y = eleDraggable.getLocation().getY();
		System.out.println("The original location is: "+location);
		
		// Create reference for Actions class
		Actions builder = new Actions(driver);
		
		// Move it by 50 px both x and y
		builder.dragAndDropBy(eleDraggable, 100, 100).perform();
		
		/*
		 * 1) All actions class should end with a method call - perform
		 * 2) Actions class do not throw any exception
		 * 3) You need to write your own verification
		 */
		System.out.println("The moved location is: "+eleDraggable.getLocation());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
