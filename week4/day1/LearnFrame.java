package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Switch to the frame
		driver.switchTo().frame(0);
		
		// Print the text
		String text = driver.findElement(By.id("draggable")).getText();
		System.out.println(text);
		
		
		// Come out of the frame
		driver.switchTo().defaultContent();
		
		// Click Demos
		driver.findElement(By.linkText("Demos")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
