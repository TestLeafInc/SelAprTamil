package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {

		// Pre condition : Chrome Driver need to be download and set to the path
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: URL load
		driver.get("http://leafground.com/pages/Alert.html");

		// Step 3: Maximize
		driver.manage().window().maximize();
		
		// Step 4: ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Click on Alert Box / Confirm Box
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		// Step 1) Switch the focus to the alert
		Alert alert = driver.switchTo().alert();
		
		// Step 2) Get the alert text
		System.out.println(alert.getText());
		
		// Step 2B) Type the text value
		alert.sendKeys("Babu's Session");
		
		// Step 3) Accept the alert
		alert.accept();
		//alert.dismiss();
		
		String text = driver.findElement(By.id("result1")).getText();
		System.out.println(text);
		
		// Print the title
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
