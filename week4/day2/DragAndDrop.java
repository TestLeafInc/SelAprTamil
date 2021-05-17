package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("https://jqueryui.com/droppable/");

		// Step 3: Maximize
		driver.manage().window().maximize();
		
		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Switch to the frame
		driver.switchTo().frame(0);
		
		// Find the element
		WebElement eleDraggable = driver.findElement(By.id("draggable"));
		WebElement eleDroppable = driver.findElement(By.id("droppable"));
		
		// Move using actions class
		Actions builder = new Actions(driver);
		builder.dragAndDrop(eleDraggable, eleDroppable).perform();
		
		// Verify that it worked
		String color = eleDroppable.getCssValue("background");
		System.out.println(color);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
