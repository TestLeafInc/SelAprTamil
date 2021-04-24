package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch and Maximize
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Enter Src and Destination
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys(Keys.TAB);

		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).sendKeys(Keys.TAB);
		
		// Choose the current date
		driver.findElement(By.className("current")).click();
		
		// Click Search buses
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(1000);

		// Covid pop screen close
		driver.findElement(By.className("close")).click();
		
		// How many buses
		String text = driver.findElement(By.className("busFound")).getText();
		System.out.println(text);

	}

}
