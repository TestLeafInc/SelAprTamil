package stepdefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class CreateLead  extends BaseSteps{
	
	
	@And("Type Company Name as (.*)$")
	public void typeCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@And("Type First Name as (.*)$")
	public void typeFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	
	@And("Type Last Name as (.*)$")
	public void typeLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	
	@And("Click Create Lead Button")
	public void clickCreateLeadSubmit() {
		driver.findElement(By.className("smallSubmit")).click();
	}

}
