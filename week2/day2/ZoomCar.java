package week2.day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException, IOException {
				
		// Pre condition : Chrome Driver need to be downloaded and set to the path
		WebDriverManager.chromedriver().setup();
		
		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: URL load
		driver.get("https://www.zoomcar.com/bangalore/");
		
		// Step 3: Maximize and Timeout
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 4: Click Start your wonderful journey
		driver.findElement(By.linkText("Start your wonderful journey")).click();
		
		// Step 5: Click 2nd listed pick up point
		driver.findElement(By.xpath("(//div[@class='items'])[2]")).click();
		
		// Step 6: Click Next
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		// Step 7: Click on tomorrow date
		driver.findElement(By.xpath("//div[@class='days']/div[2]")).click();
		
		// Step 8: Click Next
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		Thread.sleep(2000);
		
		// Step 9: Click Next month
		driver.findElement(By.xpath("//div[@class='months']/div[2]")).click();
		
		// Step 10: Click Done
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		
		// Step 11: Find out how many cars are available
		int size = driver.findElements(By.xpath("//div[@class='car-item']")).size();
		System.out.println("The number of cars listed are : "+size);
		
		// Step 12: How to take snapshot?
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap1.png");
		FileUtils.copyFile(src, dest);
		
		
		
	}

}















