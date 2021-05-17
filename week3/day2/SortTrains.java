package week3.day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTrains {

	public static void main(String[] args) throws InterruptedException {
				
		// Pre condition : Chrome Driver need to be downloaded and set to the path
		WebDriverManager.chromedriver().setup();
		
		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: URL load
		driver.get("https://erail.in/");
		
		// Step 3: Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 4: Clear, Type FROM and Tab
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("SCT", Keys.TAB);
		
		// Step 5: Clear, Type To and Tab
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MAS", Keys.TAB);
		
		// Step 6: Check Sort on Date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		// Step 7: Find the table
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		
		// Step 8: Find out how many rows are there in the table.
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		int size = tableRows.size();
		System.out.println(size);
		
		// Alternate way to find the count using XPath
		int size2 = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
		System.out.println(size2);
		
		// findElement, findElements will wait for implicitWait
		// findElement -> WebElement -> Exception: NoSuchElementException -> will it throw immediate? after 30 seconds
		// findElements -> List<WebElement> -> No Exception thrown -> Return empty list -> after 30 seconds 
		
		// Click Sort the trains by numbers
		//driver.findElement(By.xpath("//a[@title='Click here to sort on Train Number']")).click();
		
		// Print all the train numbers
		List<WebElement> allTrainNumbers = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		
		Set<String> sortedUniqueNumbers = new TreeSet<String>();
		Set<String> defaultTrainNumbers = new LinkedHashSet<String>();
		
		for (int i = 0; i < allTrainNumbers.size(); i++) {
			//System.out.println(allTrainNumbers.get(i).getText());
			sortedUniqueNumbers.add(allTrainNumbers.get(i).getText());
			defaultTrainNumbers.add(allTrainNumbers.get(i).getText());
		}
		
		System.out.println(sortedUniqueNumbers);
		System.out.println(defaultTrainNumbers);

		
		
	}

}















