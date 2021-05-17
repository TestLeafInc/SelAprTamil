package week5.day2;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseTest{
	
	
	
	//@Test(groups="Smoke")
	
	@Test(dataProvider = "TestData", timeOut=2100)
	public void createLead(String companyName, String firstName, String lastName) throws InterruptedException {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	@DataProvider(name="TestData", indices= {0})
	public Object[][] fetchData() throws InvalidFormatException, IOException{
		
		String[][] data = ReadExcelForDataProvider.readExcelData("Create Lead");
		return data;
		
	}
		
	/*
	@DataProvider(name="TestData")
	public Object[][] fetchData(){
		
		String[][] data = new String[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Hari";
		data[0][2] = "Radhakrishnan";
		
		data[1][0] = "Qeagle";
		data[1][1] = "Babu";
		data[1][2] = "Manickam";
		
		return data;
		
	} */
	
	
	
	
	
	
	
	
	
	
	
	
}
