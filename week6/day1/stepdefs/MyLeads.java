package stepdefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class MyLeads  extends BaseSteps {
	
	
	@And("Click Create Lead Menu")
	public void clickCreateLeadMenu() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	
	@And("Click Find Lead Menu")
	public void clickFindLeadMenu() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

}
