package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("https://jqueryui.com/sortable/");

		// Step 3: Maximize
		driver.manage().window().maximize();

		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Find the View Source
		WebElement eleViewSource = driver.findElementByClassName("demo-description");
		int viewSource_y = eleViewSource.getLocation().getY();
		System.out.println(viewSource_y);

		// Scroll down to the View Source
		driver.executeScript("window.scrollTo(0, "+viewSource_y+")");

		// Switch to the frame
		driver.switchTo().frame(0);

		// Find the elements
		WebElement eleOne = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement eleFive = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		// Know the six Y axis
		int y = eleFive.getLocation().getY();

		// Perform Click and Hold
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleOne, 0, y).perform();















	}

}
