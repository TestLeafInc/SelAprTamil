package week6.day2.pages;

import org.openqa.selenium.By;

import week6.day2.hooks.TestNgHooks;

public class CreateLead extends MyMenus{
	
	public CreateLead typeCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	
	public CreateLead typeFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	
	public CreateLead typeLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	
	public ViewLead clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLead();
	}

}
