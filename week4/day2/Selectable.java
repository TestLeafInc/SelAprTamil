package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("https://jqueryui.com/selectable/");

		// Step 3: Maximize
		driver.manage().window().maximize();
		
		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Switch to the frame
		driver.switchTo().frame(0);
		
		// Find the elements
		WebElement eleOne = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement eleFour = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		// Perform Click and Hold
		Actions builder = new Actions(driver);
		builder.clickAndHold(eleOne).clickAndHold(eleFour).release().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
