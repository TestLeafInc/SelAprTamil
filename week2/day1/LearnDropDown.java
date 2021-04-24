package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
				
		// Pre condition : Chrome Driver need to be downloaded and set to the path
		WebDriverManager.chromedriver().setup();
		
		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: URL load
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		// Step 3: Maximize
		driver.manage().window().maximize();
		
		// Step 4 a) Find the element 
		WebElement eleDropdown1 = driver.findElement(By.id("dropdown1"));
		
		// Step 4 b) Convert the WebElement as Select
		Select dd1 = new Select(eleDropdown1);
		
		// Step 4 c) Choose the dropdown by the visibile text [1]
		dd1.selectByVisibleText("Loadrunner");
		// Best Practice: If you are AUT is only in English
		
		// Step 4 d) Choose the dropdown by the value [2]
		// dd1.selectByValue("2");
		// Best Practice: If you testing multi lingual, value is preferred
		
		// Step 4 e) Choose the dropdown by the index [3]
		// dd1.selectByIndex(3);
		// Best Practice: While testing using Random test data 
		
		
	}

}















