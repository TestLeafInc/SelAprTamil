package week5.day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseTest {

	//@Test(groups="Sanity", dependsOnGroups = "Smoke")
	
	/*
	 * Step 1: @DataProvider -> name attribute
	 * Step 2: Dataprovider method -> return Object[2][3]
	 * Step 3: Test data -> hard code !!
	 * Step 4: To be received in the @Test(dataprovider="name")
	 * Step 5: Take the input argument and replace the value 
	 */
	
	
	@DataProvider(name="TestData")
	public Object[][] fetchData() throws InvalidFormatException, IOException{
		String[][] data = ReadExcelForDataProvider.readExcelData("Edit Lead");
		return data;
	}
	
	
	@Test(dataProvider="TestData")
	public void editLead(String phoneNumber, String companyName) throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();

	}


}
